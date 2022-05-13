package SelfPracticePlayGround.DesignPatterns.command;

import SelfPracticePlayGround.DesignPatterns.command.fx.Command;

public class ResizeCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Resize");
  }
}
