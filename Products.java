public class Products {
    // attributes
    String name;
    String description;

    // constructor
    public Products(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // method
    public void getInfo() {
        System.out.println("Product " + this.name + " " + this.description);
    }
}
