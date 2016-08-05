package structural.bridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

  @Mock
  private Bulb bulb;

  @Mock
  private Switch aSwitch;

  @Test
  public void shouldSwitchOnBulb() {
    Main.main(new String[]{"Bulb"});
  }

  @Test
  public void shouldSwitchOnRefrigerator() {
    Main.main(new String[]{"Refrigerator"});
  }
}