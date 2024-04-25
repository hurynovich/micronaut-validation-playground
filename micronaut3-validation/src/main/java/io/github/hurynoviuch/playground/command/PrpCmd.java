package io.github.hurynoviuch.playground.command;

import io.github.hurynoviuch.playground.dto.User;
import io.micronaut.context.annotation.Prototype;
import jakarta.inject.Provider;
import lombok.RequiredArgsConstructor;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.nio.file.FileSystem;

@Prototype
@RequiredArgsConstructor
@Command(name = "prp", description = "Print Random Person")
public class PrpCmd implements Runnable {

  private final Provider<User> user;

  @Option(names = {"-c", "--count"}, defaultValue = "1", description = "Number of generated persons")
  private Integer count;

  @Override
  public void run() {

    for (int i = 0; i < count; i++) {
      System.out.println(user.get());
    }
  }

}

