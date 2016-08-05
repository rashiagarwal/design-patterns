package structural.bridge;

import lombok.Setter;

public class Main {

  @Setter
  private static Switch aSwitch;

  public static void main(String[] args) {
    setEquipment(args[0]);
    triggerSwitch();
  }

  static void setEquipment(String equipment) {
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