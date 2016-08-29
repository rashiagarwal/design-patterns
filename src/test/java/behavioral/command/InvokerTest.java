package behavioral.command;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InvokerTest {

  private Invoker invoker;

  @Before
  public void setUp() {
    invoker = new Invoker();
  }

  @Test
  public void shouldReturnFileCommand() {
    Execute command = invoker.getCommand("File command");

    assertTrue(command instanceof ExecuteFile);
  }

  @Test
  public void shouldReturnPrintCommand() {
    Execute command = invoker.getCommand("Print command");

    assertTrue(command instanceof ExecutePrint);
  }
}