package flyweight.after;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new BlackDoge(10000));
        }
        System.out.println(list);
    }
}
