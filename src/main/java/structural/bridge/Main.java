package structural.bridge;

import org.springframework.beans.factory.annotation.Autowired;

public class Main {

  @Autowired
  private static Switch aSwitch;

  public static void main(String[] args) {
    setEquipment(args[0]);
    triggerSwitch();
  }

  private static void setEquipment(String equipment) {
    if (equipment.equals("Bulb")) {
      aSwitch = new Switch(new Bulb());
    }
    if (equipment.equals("Refrigerator")) {
      aSwitch = new Switch(new Refrigerator());
    }
  }

  private static void triggerSwitch() {
    aSwitch.On();
    aSwitch.Off();
  }
}