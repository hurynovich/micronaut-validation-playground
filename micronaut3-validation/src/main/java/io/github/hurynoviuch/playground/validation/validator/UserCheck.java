package io.github.hurynoviuch.playground.validation.validator;

import io.github.hurynoviuch.playground.dto.User;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
@Singleton
public class UserCheck implements Predicate<User> {

  @Override
  public boolean test(User user) {
    System.out.println((" ".repeat(10) + "!!! Validator works !!!"));
    return true;
  }

}
