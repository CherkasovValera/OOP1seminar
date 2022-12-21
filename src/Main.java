import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Product water= new Product("wine",15.3);
        System.out.println(water);

        VendingMachine machine1 = new VendingMachine();
        System.out.println(machine1);
        List <Product> magazin = new ArrayList<>();
        magazin.add(water);
        magazin.add(new Product("vine",7.35));
        magazin.add(new Product("spirt",5.45));
        magazin.add(new Soda("limonad",4.2,"buratino"));
        magazin.add(new Fruits("mandarin",7.52,"abchazia",10));
        VendingMachine machine2 = new VendingMachine(magazin);
        System.out.println(machine2);
        System.out.println(machine2.findBy("limonad"));
        System.out.println(machine2.findByPrice(5.45));
        System.out.println(machine2.findByPriceRang(5.45,15.5));
        System.out.println(machine2.findBy("mandarin"));
    }
}