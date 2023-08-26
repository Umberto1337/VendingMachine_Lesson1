import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Chocolate getChocolate(String name){
        for (Product product : products) {
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate)product;
                if (chocolate.getName().equals(name)){
                    return chocolate;
                }
            }
        }
        return null;
    }

}
