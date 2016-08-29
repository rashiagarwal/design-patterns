package creational.factory;

class InvoiceWithoutHeader implements IInvoice {

  public String Print() {
    return "Invoice will be printed without headers";
  }
}