package abstractionTwo;

public class Flagship extends Handphone {
    boolean nfc;
    boolean fastcharging;

    public Flagship(String brand, String cpu, int ram, int storage, int batteryCapacity) {
        super(brand, cpu, ram, storage, batteryCapacity);
    }

    // Polymorphism
    public void setCharging() {
        System.out.println("Charging Handphone Flagship Level");
    }
}
