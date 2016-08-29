package behavioral.command;

class ExecuteFile extends Execute {

  ExecuteFile() {
    setCommand("File command");
  }

  public String execute() {
    return getCommand();
  }
}
