package creational.factory;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {
  private Main main = new Main();

  @Test
  public void shouldPrintInvoiceWithHeader() {
    String invoice = main.getInvoice(1);

    assertThat(invoice, is("Invoice will be printed with headers"));
  }

  @Test
  public void shouldPrintInvoiceWithoutHeader() {
    String invoice = main.getInvoice(2);

    assertThat(invoice, is("Invoice will be printed without headers"));
  }
}