package behavioral.chainOfResponsibility;

class ConsoleLogger extends AbstractLogger {

  ConsoleLogger(int level) {
    this.level = level;
  }

  @Override
  protected String write(String message) {
    return "Standard Console::Logger: " + message;
  }
}