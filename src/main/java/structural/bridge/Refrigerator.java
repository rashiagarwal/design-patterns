package structural.bridge;

class Refrigerator implements IEquipment {

  public void Start() {
    System.out.println("Start Compressor");
    System.out.println("Start Ice Cooling");
  }

  public void Stop() {
    System.out.println("Stop Ice Cooling");
    System.out.println("Stop Compressor");
  }
}
