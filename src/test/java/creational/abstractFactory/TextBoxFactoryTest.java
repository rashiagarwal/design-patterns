package creational.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextBoxFactoryTest {
  @Test
  public void shouldCreateButtonInstance() {
    IRender textBoxObject = TextBoxFactory.getTextBoxObject();
    assertEquals(TextBox.class, textBoxObject.getClass());
  }
}