package abstraction;

public class Entry extends Handphone {

    public Entry(String brand, String cpu) {
        super(brand, cpu);
    }

    @Override
    public void setCharging() {
        System.out.println("Charging Handphone Entry Level 18 Watt");
    }
}
