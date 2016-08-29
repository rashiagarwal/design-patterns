package behavioral.command;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExecuteFileTest {

  @Test
  public void shouldReturnFileCommand() {
    ExecuteFile executeFile = new ExecuteFile();

    assertThat(executeFile.execute(), is("File command"));
  }
}