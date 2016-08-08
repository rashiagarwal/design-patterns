package creational.factory;

public class InvoiceWithoutHeader implements IInvoice {

  public void Print() {
    System.out.println("Invoice will be printed without headers");
  }
}
