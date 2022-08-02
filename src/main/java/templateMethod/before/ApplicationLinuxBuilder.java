package templateMethod.before;

public class ApplicationLinuxBuilder {
    public void writeApp(){
        openSystem();
        installIDE();
        runIDE();
    }

    private void openSystem(){
        System.out.println("Pressed power button. Your OS is starting");
    }

    private void installIDE(){
        System.out.println("apt-get install idea");
    }

    private void runIDE(){
        System.out.println("./idea/run.sh");
    }


}
