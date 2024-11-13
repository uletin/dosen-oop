public class Food extends Products {
    boolean expired;

    public void getExpired() {
        System.out.println("makanan ini sudah expired");
    }

    public void setExpired() {
        expired = true;
        System.out.println("makanan ini di set " + expired);
    }
}
