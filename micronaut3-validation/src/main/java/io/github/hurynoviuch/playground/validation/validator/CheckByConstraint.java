package io.github.hurynoviuch.playground.validation.validator;

import io.github.hurynoviuch.playground.validation.constrain.CheckBy;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.annotation.Context;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Collection;
import java.util.function.Predicate;

@Context
@Slf4j
@RequiredArgsConstructor
public class CheckByConstraint implements ConstraintValidator<CheckBy, Object> {

  private final ApplicationContext context;
  private Collection<Predicate<? extends Object>> check;

  @Override
  public void initialize(CheckBy annotation) {
    Class<? extends Predicate>[] beanTypes = annotation.value();

    for (Class<? extends Object> type : beanTypes) {
      Object c = context.getBean(type);
    }
  }

  @Override
  public boolean isValid(Object value, ConstraintValidatorContext context) {
    return true;
  }

}
