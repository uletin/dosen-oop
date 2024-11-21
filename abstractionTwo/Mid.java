package abstractionTwo;

public class Mid extends Handphone {
    boolean nfc;
    boolean fastcharging;

    public Mid(String brand, String cpu, int ram, int storage, int batteryCapacity) {
        super(brand, cpu, ram, storage, batteryCapacity);
    }

    // Polymorphism overloading
    // Ada Penambahan Parameter
    public void getInfo(String name) {
        System.out.println("Ini handphone mid level " + name);
    }

    // Polymorphism override
    // Tidak ada penambahan parameter
    public void setCharging() {
        System.out.println("Charging Handphone Mid Level");
    }
}
