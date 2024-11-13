public class Handphone extends Products {
    int warranty;

    public Handphone(int warranty) {
        this.warranty = warranty;
    }

    public void getWarranty() {
        System.out.println("Produk ini bergaransi " + this.warranty);
    }
}
