package behavioral.chainOfResponsibility;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FileLoggerTest {

  private FileLogger logger = new FileLogger(AbstractLogger.DEBUG);

  @Test
  public void shouldWrite() {
    String result = logger.write("testing file logger");

    assertThat(result, is("File::Logger: testing file logger"));
  }
}