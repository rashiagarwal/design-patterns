package creational.factory;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class InvoiceFactoryTest {


  @Test
  public void shouldGetInvoiceWithHeader() {
    InvoiceFactory invoiceFactory = new InvoiceFactory();
    IInvoice invoice = invoiceFactory.getInvoice(1);

    assertTrue(invoice instanceof InvoiceWithHeader);
  }

  @Test
  public void shouldGetInvoiceWithoutHeader() {
    InvoiceFactory invoiceFactory = new InvoiceFactory();
    IInvoice invoice = invoiceFactory.getInvoice(2);

    assertTrue(invoice instanceof InvoiceWithoutHeader);
  }

  @Test
  public void shouldReturnNull() {
    InvoiceFactory invoiceFactory = new InvoiceFactory();
    IInvoice invoice = invoiceFactory.getInvoice(12);

    assertNull(invoice);
  }
}