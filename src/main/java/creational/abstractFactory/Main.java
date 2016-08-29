package creational.abstractFactory;

import static creational.abstractFactory.AbstractFactory.getUIObject;

class Main {

  String renderUIObject(int objectId) {
    IRender uiObject = getUIObject(objectId);
    return uiObject.render();
  }
}
