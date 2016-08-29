package structural.composite;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

  @Test
  public void shouldReturnRectangle() {
    Rectangle rectangle = new Rectangle();
    String name = rectangle.Name();

    assertThat(name, is("Rectangle"));
  }
}