package templateMethod.before;

public class ApplicationWindowsBuilder {
    public void writeApp(){
        openSystem();
        installIDE();
        restartSystem();
        runIDE();
    }

    private void openSystem(){
        System.out.println("Pressed power button. Your OS is starting");
    }

    private void installIDE(){
        System.out.println("Switch program in control panel");
    }

    private void restartSystem(){
        System.out.println("System restarted");
    }

    private void runIDE(){
        System.out.println("Double click on shortcut");
    }

}
