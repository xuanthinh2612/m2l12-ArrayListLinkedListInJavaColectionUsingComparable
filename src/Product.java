import java.util.PrimitiveIterator;

public class Product implements Comparable{
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "@ID: "+id+",name: "+name+",Price" + price;
    }

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;
        if (this.price>p.price) return 1;
        else if (this.price< p.price) return -1;
        return 0;
    }
}
