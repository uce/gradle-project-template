package com.github.uce.app;

import java.util.concurrent.Callable;
import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Slf4j
@CommandLine.Command(
    name = "name",
    mixinStandardHelpOptions = true,
    version = "1.0",
    description = "Does something.")
public class App implements Callable<Integer> {

  @Parameters(index = "0", description = "arg0", defaultValue = "default-value")
  private String arg0;

  @Option(
      names = {"-f", "--flag"},
      description = "Flag for something...",
      defaultValue = "true")
  private boolean flag;

  @Override
  public Integer call() {
    System.out.println(arg0);
    System.out.println(flag);
    return 0;
  }

  public static void main(String[] args) {
    int exitCode = new CommandLine(new App()).execute(args);
    System.exit(exitCode);
  }
}
