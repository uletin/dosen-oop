public class Clothes extends Products {
    String size;

    public Clothes(String name, String description, int price, String color, String brand, String size) {
        this.size = size;

    }

    public void getSize() {
        System.out.println("baju ini berukuran " + this.size);
    }
}
