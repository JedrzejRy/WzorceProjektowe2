package templateMethod.task;

public class Main {
    public static void main(String[] args) {
        Computer computer = new EconomicComputer();
        computer.buildComputer();
        System.out.println();
        Computer computer1 = new PremiumComputer();
        computer1.buildComputer();
    }
}
