package templateMethod.after;

public abstract class ApplicationBuilder {
    public void writeApp(){
        openSystem();
        installIDE();
        runIDE();
    }

    private void openSystem(){
        System.out.println("Pressed power button. Your OS is starting");
    }

    public abstract void installIDE();
    public abstract void runIDE();


}
