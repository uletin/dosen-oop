package abstractionTwo;

abstract class Handphone {
    String brand;
    String cpu;
    int ram;
    int storage;
    int batteryCapacity;

    public Handphone(String brand, String cpu, int ram, int storage, int batteryCapacity) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.batteryCapacity = batteryCapacity;
    }

    public void getInfo() {
        System.out.println("Ini Handphone");
    }

    // abstaction
    abstract void setCharging();

}
