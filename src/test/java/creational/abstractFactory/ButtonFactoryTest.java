package creational.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ButtonFactoryTest {
  @Test
  public void shouldCreateButtonInstance() {
    IRender buttonObject = ButtonFactory.getButtonObject();
    assertEquals(Button.class, buttonObject.getClass());
  }
}