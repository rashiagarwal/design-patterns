package structural.composite;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {

  @Test
  public void shouldCallAllShapes() {
    Main main = new Main();
    String s = main.returnAllShapes();
    assertThat(s.trim(), is("Circle Rectangle"));
  }
}