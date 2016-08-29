package creational.factory;

public class Main {

  public String getInvoice(int id) {
    InvoiceFactory invoiceFactory = new InvoiceFactory();
    IInvoice invoice = invoiceFactory.getInvoice(id);
    return invoice.Print();
  }
}
