package io.github.hurynoviuch.playground.validation.constrain;

import io.github.hurynoviuch.playground.validation.validator.MyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Constraint(validatedBy = {MyValidator.class})
public @interface MyConstraint {
  String message() default "TODO: implement";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  String when() default "";

}
