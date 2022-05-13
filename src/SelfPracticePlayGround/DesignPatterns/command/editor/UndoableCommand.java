package SelfPracticePlayGround.DesignPatterns.command.editor;

public interface UndoableCommand extends Command {
  void unexecute();
}
