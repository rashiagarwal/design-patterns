package structural.bridge;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
class Switch implements ISwitch {

  @Autowired
  private IEquipment equipment;

  public void On() {
    equipment.Start();
  }

  public void Off() {
    equipment.Stop();
  }
}