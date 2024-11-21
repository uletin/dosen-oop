package abstractionTwo;

public class Entry extends Handphone {

    public Entry(String brand, String cpu, int ram, int storage, int batteryCapacity) {
        super(brand, cpu, ram, storage, batteryCapacity);
    }

    @Override
    public void getInfo() {
        System.out.println("Ini Handphone Entry Level");
    }

    public void setCharging() {
        System.out.println("Charging Handphone Entry Level");
    }
}
