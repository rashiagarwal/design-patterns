package behavioral.command;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExecutePrintTest {

  @Test
  public void shouldReturnFileCommand() {
    ExecutePrint executePrint = new ExecutePrint();

    assertThat(executePrint.execute(), is("Print command"));
  }
}