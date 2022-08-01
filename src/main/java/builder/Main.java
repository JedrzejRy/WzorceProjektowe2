package builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .buildProcessor("Intel")
                .buildGraphicCard("RTX")
                .buildMemory("16GB")
                .build();
        System.out.println(computer);
    }
}
