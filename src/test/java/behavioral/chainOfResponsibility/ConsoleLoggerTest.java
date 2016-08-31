package behavioral.chainOfResponsibility;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConsoleLoggerTest {
  private ConsoleLogger logger = new ConsoleLogger(AbstractLogger.INFO);

  @Test
  public void shouldWrite() {
    String result = logger.write("testing console logger");

    assertThat(result, is("Standard Console::Logger: testing console logger"));
  }
}