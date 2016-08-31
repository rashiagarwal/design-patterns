package behavioral.chainOfResponsibility;

class FileLogger extends AbstractLogger {

  FileLogger(int level) {
    this.level = level;
  }

  @Override
  protected String write(String message) {
    return "File::Logger: " + message;
  }
}