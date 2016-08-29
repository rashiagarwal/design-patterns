package creational.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AbstractFactoryTest {

  @Test
  public void shouldCreateTextBoxObject() {
    IRender uiObject = AbstractFactory.getUIObject(1);

    assertTrue(uiObject instanceof TextBox);
  }

  @Test
  public void shouldCreateButtonObject() {
    IRender uiObject = AbstractFactory.getUIObject(2);

    assertTrue(uiObject instanceof Button);
  }

  @Test
  public void shouldReturnObject() {
    IRender uiObject = AbstractFactory.getUIObject(12);

    assertNull(uiObject);
  }
}