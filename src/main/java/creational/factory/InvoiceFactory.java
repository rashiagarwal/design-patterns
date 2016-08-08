package creational.factory;

class InvoiceFactory {

  IInvoice getInvoice(int type) {
    switch (type) {
      case 1:
        return new InvoiceWithHeader();
      case 2:
        return new InvoiceWithoutHeader();
      default:
        return null;
    }
  }
}
