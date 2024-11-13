public class Products {
    // attributes
    private String name;
    private String description;
    int price;
    private String brand;
    String color;

    // SetProduct adalah Encapsulation
    public void setProducts(String name, String description, int price, String brand, String color) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    // method getInfo()
    public void getInfo() {
        System.out.println("Product " + this.name + " " + this.description + "Berasal dari brand " + brand);
    }

    // method getPrice()
    public void getPrice() {
        System.out.println("Product" + this.name + " " + "dibandrol dengan harga " + this.price);
    }

}
