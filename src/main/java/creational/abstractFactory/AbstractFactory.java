package creational.abstractFactory;

import static creational.abstractFactory.ButtonFactory.getButtonObject;
import static creational.abstractFactory.TextBoxFactory.getTextBoxObject;

class AbstractFactory {

  static IRender getUIObject(int objectType) {
    switch (objectType) {
      case 1:
        return getTextBoxObject();
      case 2:
        return getButtonObject();
      default:
        return null;
    }
  }
}
