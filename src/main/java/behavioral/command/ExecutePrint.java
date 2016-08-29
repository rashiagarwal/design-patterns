package behavioral.command;

class ExecutePrint extends Execute {

  ExecutePrint() {
    setCommand("Print command");
  }

  public String execute() {
    return getCommand();
  }
}
