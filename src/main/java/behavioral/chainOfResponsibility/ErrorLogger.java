package behavioral.chainOfResponsibility;

class ErrorLogger extends AbstractLogger {

  ErrorLogger(int level) {
    this.level = level;
  }

  @Override
  protected String write(String message) {
    return "Error Console::Logger: " + message;
  }
}