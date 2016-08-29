package creational.abstractFactory;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {

  private Main main = new Main();

  @Test
  public void shouldRenderTextBox() {
    String renderUIObject = main.renderUIObject(1);
    assertThat(renderUIObject, is("TextBox Rendered"));
  }

  @Test
  public void shouldRenderButton() {
    String renderUIObject = main.renderUIObject(2);
    assertThat(renderUIObject, is("Button Rendered"));
  }
}