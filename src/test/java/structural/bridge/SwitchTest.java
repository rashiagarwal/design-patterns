package structural.bridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;


@RunWith(MockitoJUnitRunner.class)
public class SwitchTest {

  @Mock
  private IEquipment equipment;

  @InjectMocks
  private Switch aSwitch;

  @Test
  public void shouldStartEquipment() {
    aSwitch.On();

    Mockito.verify(equipment, times(1)).Start();
  }

  @Test
  public void shouldStopEquipment() {
    aSwitch.Off();

    Mockito.verify(equipment, times(1)).Stop();
  }
}