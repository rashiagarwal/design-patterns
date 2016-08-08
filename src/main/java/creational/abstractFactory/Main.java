package creational.abstractFactory;

import static creational.abstractFactory.AbstractFactory.getUIObject;

public class Main {
  public static void main(String[] args) {
    IRender uiObject = getUIObject(Integer.parseInt(args[0]));
    uiObject.render();
  }
}
