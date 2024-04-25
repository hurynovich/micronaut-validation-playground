package io.github.hurynoviuch.playground.validation.constrain;

import io.github.hurynoviuch.playground.validation.validator.CheckByConstraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.Valid;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.function.Predicate;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Valid
@Constraint(validatedBy = CheckByConstraint.class)
public @interface CheckBy {
  String message() default "Validation problem.";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  Class<? extends Predicate<?>>[] value();

}
