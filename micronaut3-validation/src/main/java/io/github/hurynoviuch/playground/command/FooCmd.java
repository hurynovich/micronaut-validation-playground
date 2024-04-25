package io.github.hurynoviuch.playground.command;

import io.micronaut.context.annotation.Prototype;
import lombok.RequiredArgsConstructor;
import picocli.CommandLine.Command;

@Prototype
@RequiredArgsConstructor
@Command(name = "foo", description = "//TODO: describe")
public class FooCmd implements Runnable {

  @Override
  public void run() {
  }

}

