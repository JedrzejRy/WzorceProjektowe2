package flyweight.Task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Tank("A4"));
        unitList.add(new RifleMan("C8"));
        unitList.add(new Destroyer("F3"));

        System.out.println(unitList);
    }
}
