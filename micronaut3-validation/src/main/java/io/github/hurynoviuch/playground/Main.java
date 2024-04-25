package io.github.hurynoviuch.playground;

import io.github.hurynoviuch.playground.command.PrpCmd;
import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;


@Command(subcommands = {
   PrpCmd.class
})
public class Main implements Runnable {

  public static void main(String[] args) throws Exception {
    PicocliRunner.run(Main.class, args);
  }

  @Override
  public void run() {
    System.out.println("//TODO: implement help");
  }
}
