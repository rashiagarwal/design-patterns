package creational.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AbstractFactoryTest {

  @Test
  public void shouldCreateTextBoxObject() {
    IRender uiObject = AbstractFactory.getUIObject(1);

    assertEquals(TextBox.class, uiObject.getClass());
  }

  @Test
  public void shouldCreateButtonObject() {
    IRender uiObject = AbstractFactory.getUIObject(2);

    assertEquals(Button.class, uiObject.getClass());
  }

  @Test
  public void shouldReturnObject() {
    IRender uiObject = AbstractFactory.getUIObject(12);

    assertNull(uiObject);
  }
}