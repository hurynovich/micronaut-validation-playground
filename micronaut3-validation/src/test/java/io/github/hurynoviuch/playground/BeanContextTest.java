package io.github.hurynoviuch.playground;

import io.github.hurynoviuch.playground.dto.User;
import io.micronaut.context.BeanContext;
import io.micronaut.context.DefaultApplicationContext;
import io.micronaut.context.DefaultBeanContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@MicronautTest
public class BeanContextTest {

  BeanContext beanContext = new DefaultBeanContext();
  BeanContext appContext = new DefaultApplicationContext();

  @Test
  void testBeanContext() {
    appContext.start();
    beanContext.start();
    Optional<User> user = appContext.findBean(User.class);
    Assertions.assertTrue(user.isPresent());
  }

}
