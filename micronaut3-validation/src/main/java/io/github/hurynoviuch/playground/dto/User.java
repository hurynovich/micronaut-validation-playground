package io.github.hurynoviuch.playground.dto;

import io.github.hurynoviuch.playground.validation.constrain.CheckBy;
import io.github.hurynoviuch.playground.validation.validator.UserCheck;
import lombok.Data;


@Data
@CheckBy(value = UserCheck.class)
public class User {

  private String name;

  private String surname;

  private Group group;

  @Override
  public String toString() {
    return name + " " + surname;
  }

  @Data
  public static class Group {
    private String name;
  }

  @Data
  public static class SubGroup {
    private String name;
  }
}
