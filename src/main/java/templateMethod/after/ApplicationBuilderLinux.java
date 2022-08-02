package templateMethod.after;

public class ApplicationBuilderLinux extends ApplicationBuilder{
    @Override
    public void installIDE() {
        System.out.println("apt-get install idea");
    }

    @Override
    public void runIDE() {
        System.out.println("./idea/run.sh");
    }
}
