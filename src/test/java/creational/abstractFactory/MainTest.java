package creational.abstractFactory;

import org.junit.Test;

import static creational.abstractFactory.Main.main;

public class MainTest {
  @Test
  public void shouldRenderButton() {
    main(new String[]{"2"});
  }

  @Test
  public void shouldRenderTextBox() {
    main(new String[]{"1"});
  }
}