package io.github.hurynoviuch.playground.bean;

import io.micronaut.context.BeanContext;
import io.micronaut.context.annotation.Context;

@Context
public class ContextWelcomePrinter {
  private final BeanContext ctx;

  public ContextWelcomePrinter(BeanContext ctx) {
    this.ctx = ctx;
    System.out.println("Welcome bean context " + ctx + " !");
  }
}
