package io.github.hurynoviuch.playground.validation.constrain;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, PARAMETER})
@Retention(RUNTIME)
@Documented
@Null
//@Pattern(regexp = "^#(?:[0-9a-fA-F]{3}){1,2}$")
@Constraint(validatedBy = {})
@ReportAsSingleViolation
public @interface Color {
  String message() default "Invalid RGB hex color value '${validatedValue}'.";
  Class<?>[] groups() default { };
  Class<? extends Payload>[] payload() default { };
}
