package strategy.task;

public class Main {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("John", 60);
        if (citizen.getAge()>50){
            citizen.setPrice(new Discount());
            System.out.println(citizen.getMedicinePrice(100));
        }else {
            citizen.setPrice(new NoDiscount());
            System.out.println(citizen.getMedicinePrice(100));
        }

    }
}
