package creational.abstractFactory;

class ButtonFactory {

  static IRender getButtonObject() {
    return new Button();
  }
}
