package behavioral.chainOfResponsibility;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ErrorLoggerTest {
  private ErrorLogger logger = new ErrorLogger(AbstractLogger.ERROR);

  @Test
  public void shouldWrite() {
    String result = logger.write("testing error logger");

    assertThat(result, is("Error Console::Logger: testing error logger"));
  }
}