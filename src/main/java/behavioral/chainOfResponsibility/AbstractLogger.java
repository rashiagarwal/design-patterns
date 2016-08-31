package behavioral.chainOfResponsibility;

import lombok.Setter;

abstract class AbstractLogger {

  static int INFO = 1;
  static int DEBUG = 2;
  static int ERROR = 3;

  int level;

  @Setter
  protected AbstractLogger nextLogger;

  String logMessage(int level, String message) {
    if (this.level <= level) {
      return write(message);
    }
    if (nextLogger != null) {
      return nextLogger.logMessage(level, message);
    }
    return null;
  }

  abstract protected String write(String message);
}