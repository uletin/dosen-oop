import abstractionTwo.Entry;
import abstractionTwo.Mid;

public class Main {
    public static void main(String[] args) {
        Entry entry = new Entry("Samsung A13", "Exynos", 8, 128, 5000);
        Mid mid = new Mid("Samsung A13", "Exynos", 8, 128, 5000);

        mid.getInfo("Samsung");
    }
}