package creational.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InvoiceFactoryTest {


  @Test
  public void shouldGetInvoiceWithHeader() {
    InvoiceFactory invoiceFactory = new InvoiceFactory();
    IInvoice invoice = invoiceFactory.getInvoice(1);

    assertEquals(InvoiceWithHeader.class, invoice.getClass());
  }

  @Test
  public void shouldGetInvoiceWithoutHeader() {
    InvoiceFactory invoiceFactory = new InvoiceFactory();
    IInvoice invoice = invoiceFactory.getInvoice(2);

    assertEquals(InvoiceWithoutHeader.class, invoice.getClass());
  }

  @Test
  public void shouldReturnNull() {
    InvoiceFactory invoiceFactory = new InvoiceFactory();
    IInvoice invoice = invoiceFactory.getInvoice(12);

    assertNull(invoice);
  }

}