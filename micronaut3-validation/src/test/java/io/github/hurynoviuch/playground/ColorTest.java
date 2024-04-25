package io.github.hurynoviuch.playground;

import io.github.hurynoviuch.playground.validation.constrain.Color;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.validation.validator.Validator;
import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class ColorTest {

  @Inject
  Validator validator;

  @Test
  void colorInvalid() {
    PaletteDto palette = new PaletteDto("color");
    Set<ConstraintViolation<PaletteDto>> result = validator.validate(palette);
    assertEquals(1, result.size());
    ConstraintViolation<PaletteDto> violation = result.stream().findFirst().get();
    assertEquals("", violation.getMessage());
  }

  @Introspected
  @AllArgsConstructor
  @Data
  static class PaletteDto {
    @Color
//    @Pattern(regexp = "^#(?:[0-9a-fA-F]{3}){1,2}$", message = "Custom message {regexp}")
    private String primary;
  }
}
