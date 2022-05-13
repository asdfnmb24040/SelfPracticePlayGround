package SelfPracticePlayGround.DesignPatterns.command;

import SelfPracticePlayGround.DesignPatterns.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Black and white");
  }
}
