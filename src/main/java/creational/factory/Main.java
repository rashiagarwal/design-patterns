package creational.factory;

public class Main {

  public static void main(String[] args) {
    InvoiceFactory invoiceFactory = new InvoiceFactory();
    IInvoice invoice = invoiceFactory.getInvoice(Integer.parseInt(args[0]));
    invoice.Print();
  }
}
