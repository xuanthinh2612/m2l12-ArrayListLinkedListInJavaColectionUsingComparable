import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.add(new Product(5,"sp5",600));
        manager.add(new Product(3,"sp3",300));
        manager.add(new Product(1,"sp1",100));
        manager.add(new Product(2,"sp2",200));
        manager.add(new Product(4,"sp4",400));
//        manager.remove(5);
        manager.ShowProduct();
        manager.sortByPriceIncrease();
        manager.ShowProduct();
        manager.sortByPriceDecrease();
        manager.ShowProduct();


//        Product out = manager.findByName("sp1");
//        Character a = 'A';
//        Character b = 'a';
//        boolean c = a<b;
//        System.out.println(c);


    }
}
