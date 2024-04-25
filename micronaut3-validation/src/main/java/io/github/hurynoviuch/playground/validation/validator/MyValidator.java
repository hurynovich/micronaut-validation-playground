package io.github.hurynoviuch.playground.validation.validator;

import io.github.hurynoviuch.playground.validation.constrain.MyConstraint;
import io.micronaut.context.annotation.Prototype;
import lombok.RequiredArgsConstructor;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.StandardELContext;
import javax.el.ValueExpression;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;

@Prototype
@RequiredArgsConstructor
public class MyValidator implements ConstraintValidator<MyConstraint, Object> {

  private final ExpressionFactory elf;
  private ValueExpression predicate;

  @Override
  public void initialize(MyConstraint annotation) {
    String exp = annotation.when();
    ELContext ctx = new StandardELContext(elf);
    predicate = elf.createValueExpression(ctx, exp, Boolean.class);
  }

  @Override
  public boolean isValid(Object value, ConstraintValidatorContext validatorContext) {
    ArrayList a = new ArrayList();

    ELContext ctx = new StandardELContext(elf);
    elf.createValueExpression(ctx, "${this}", Object.class).setValue(ctx, value);
    Object v = predicate.getValue(ctx);
    return true;
  }

}
