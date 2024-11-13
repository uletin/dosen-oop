public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        food.setProducts("keripik", "rasa ayam panggang", 10000, "potabee", "hitam");
        food.getInfo();
        food.setExpired();
        food.getExpired();
    }
}