package structural.bridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

  @Mock
  private Bulb bulb;

  @Mock
  private Switch aSwitch;

  @InjectMocks
  private Main applicationEntry;

  @Test
  public void shouldSwitchOnBulb() {
    applicationEntry.main(new String[]{"Bulb"});
  }

  @Test
  public void shouldSwitchOnRefrigerator() {
    applicationEntry.main(new String[]{"Refrigerator"});
  }
}