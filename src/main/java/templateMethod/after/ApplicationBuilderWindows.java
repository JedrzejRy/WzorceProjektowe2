package templateMethod.after;

public class ApplicationBuilderWindows extends ApplicationBuilder{
    @Override
    public void installIDE() {
        System.out.println("Switch program in control panel");
    }

    @Override
    public void runIDE() {
        System.out.println("Double click on shortcut");
    }
}
