public class Fashions extends Products {
    String size;

    public Fashions(String name, String description, String size) {
        // super(), adalah constructor superclass (class Products)
        super(name, description);
        this.size = size;
    }
}
