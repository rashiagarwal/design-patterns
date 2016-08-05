package structural.bridge;

class Bulb implements IEquipment {

  public void Start() {
    System.out.println("Warm up the bulb");
    System.out.println("Glow the bulb");
  }

  public void Stop() {
    System.out.println("Switch off the bulb");
  }
}
