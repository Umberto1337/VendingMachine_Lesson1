public class Chocolate extends Product {

    private int calories; // Калории

    public Chocolate(String name, String brand, double price, int calories){
        super(name, brand, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
    
    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - Калории: %d", name, brand, price, calories);
    }
}
