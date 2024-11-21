package abstraction;

abstract class Handphone {
    String brand;
    String cpu;
    int ram;
    int storage;
    int batteryCapacity;
    int wattCharging;

    public Handphone(String brand, String cpu) {
        this.brand = brand;
        this.cpu = cpu;
    }

    public void getInformation() {
        System.out.println("Mendapatkan informasi brand " + brand);
    }

    public abstract void setCharging();
}
