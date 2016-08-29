package creational.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ButtonFactoryTest {
  @Test
  public void shouldCreateButtonInstance() {
    IRender buttonObject = ButtonFactory.getButtonObject();

    assertTrue(buttonObject instanceof Button);
  }
}