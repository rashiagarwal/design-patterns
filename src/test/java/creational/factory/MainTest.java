package creational.factory;

import org.junit.Test;

public class MainTest {

  @Test
  public void shouldPrintInvoiceWithHeader() {
    Main.main(new String[]{"1"});
  }

  @Test
  public void shouldPrintInvoiceWithoutHeader() {
    Main.main(new String[]{"2"});
  }
}