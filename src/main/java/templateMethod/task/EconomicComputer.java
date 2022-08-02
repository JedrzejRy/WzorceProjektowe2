package templateMethod.task;

public class EconomicComputer extends Computer{
    @Override
    public void addingPowerSupply() {
        System.out.println("400W Power supply installed");
    }

    @Override
    public void addingMotherBoard() {
        System.out.println("Gigabyte B660M DS3H DDR4 installed ");
    }

    @Override
    public void addingProcessor() {
        System.out.println("intel i5 7400 installed");
    }

    @Override
    public void addingGraphicCard() {
        System.out.println("GTX 1660 Installed");
    }

    @Override
    public void addingRAM() {
        System.out.println("16GB installed");
    }
}
