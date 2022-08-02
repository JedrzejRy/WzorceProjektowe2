package templateMethod.task;

public abstract class Computer {

    public void buildComputer(){
        addingCase();
        addingPowerSupply();
        addingMotherBoard();
        addingProcessor();
        addingGraphicCard();
        addingRAM();
    }

    private void addingCase(){
        System.out.println("Case ready");
    }
    public abstract void addingPowerSupply();
    public abstract void addingMotherBoard();
    public abstract void addingProcessor();
    public abstract void addingGraphicCard();
    public abstract void addingRAM();



}
