package creational.abstractFactory;

class TextBoxFactory  {

  static IRender getTextBoxObject() {
    return new TextBox();
  }
}
