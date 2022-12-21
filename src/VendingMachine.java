import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    private List<Product> prodList;

    private static List<Product> DEAFAULT = new ArrayList<>(Arrays.asList(new Product("zugar", 1.2)));

    public VendingMachine(List<Product> prodList) {
        this.prodList = prodList;
    }

    public VendingMachine() {
        this(DEAFAULT);// Вызов конструктора
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        prodList.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }
    public List<Product> findBy(String name) {
        return finder(p->p.getName().equals(name));
    }
    public List<Product> findByPrice(double price) {
        return finder(p->p.getPrice()==price);
    }
    public List<Product> findByPriceRang(double p1, double p2) {
        return finder(p->p.getPrice()<p2&& p.getPrice()>p1);
    }
    private List finder(Function<Product, Boolean>f){
        List<Product> result = new ArrayList<>();
        prodList.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i)))
            result.add(i);
        });
        return result;
    }
}
