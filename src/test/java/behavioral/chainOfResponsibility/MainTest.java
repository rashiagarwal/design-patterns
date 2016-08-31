package behavioral.chainOfResponsibility;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {

  private Main main = new Main();
  private AbstractLogger loggerChain = main.getChainOfLoggers();

  @Test
  public void shouldLogInfo() {
    String logMessage = loggerChain.logMessage(AbstractLogger.INFO, "This is an information");

    assertThat(logMessage, is("Standard Console::Logger: This is an information"));
  }

  @Test
  public void shouldLogDebugInfo() {
    String logMessage = loggerChain.logMessage(AbstractLogger.DEBUG, "This is an information");

    assertThat(logMessage, is("File::Logger: This is an information"));
  }

  @Test
  public void shouldLogErrorInfo() {
    String logMessage = loggerChain.logMessage(AbstractLogger.ERROR, "This is an information");

    assertThat(logMessage, is("Error Console::Logger: This is an information"));
  }
}