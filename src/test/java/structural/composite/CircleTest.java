package structural.composite;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CircleTest {

  @Test
  public void shouldReturnCircle() {
    Circle circle = new Circle();
    String name = circle.Name();

    assertThat(name, is("Circle"));
  }
}