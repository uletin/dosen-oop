package abstraction;

public class Mid extends Handphone {
    public Mid(String brand, String cpu) {
        super(brand, cpu);
    }

    @Override
    public void setCharging() {
        super.wattCharging = wattCharging;
        System.out.println("Charging Handphone Mid Level");

    }
}
