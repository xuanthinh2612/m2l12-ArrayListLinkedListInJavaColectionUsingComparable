import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoA implements Comparable {
    String name;
    int price;

    public DemoA(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public int compareTo(Object o) {
        DemoA a = (DemoA) o;
        if (this.price > a.price) return -1;
        else if (this.price == a.price) return 0;
            else return 1;
    }

    public static void main(String[] args) {
        List<DemoA> aList = new ArrayList<>();
        aList.add(new DemoA("Thinh", 12));
        aList.add(new DemoA("Thinh", 13));
        aList.add(new DemoA("Thinh", 10));
        Collections.sort(aList);
        for (DemoA a : aList){
            System.out.println(a.price);
        }
//        System.out.println(aList);
    }
}
