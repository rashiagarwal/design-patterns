package creational.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TextBoxFactoryTest {
  @Test
  public void shouldCreateButtonInstance() {
    IRender textBoxObject = TextBoxFactory.getTextBoxObject();

    assertTrue(textBoxObject instanceof TextBox);
  }
}