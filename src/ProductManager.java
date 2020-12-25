import java.util.*;

public class ProductManager  {
    private List<Product> list = new ArrayList<Product>();

    public void add(Product product) {
        list.add(product);
    }

    public void edit(int id, Product product) {
        for (Product p : list) {
            if (p.getId() == id) {
                list.set(id, product);
                return;
            }
        }
    }

    public void remove(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(list.get(i));
            }
        }
//        list.removeIf(p -> p.getId()==id);
    }

    public void ShowProduct() {
        System.out.println(list);

    }

    public Product findByName(String name) {
        for (Product p : list) {
            if (p.getName() == name) {
                return p;
            }
        }
        return null;

    }


    public void sortByPriceIncrease() {
        Collections.sort(list);
    }

    public void sortByPriceDecrease() {
        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()>o2.getPrice())return -1;
                if (o1.getPrice()<o2.getPrice())return 1;
                return 0;
            }
        });
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
}
