package templateMethod.after;

public class Main {
    public static void main(String[] args) {
        ApplicationBuilder windowsApp = new ApplicationBuilderWindows();
        windowsApp.writeApp();
        ApplicationBuilder linuxApp = new ApplicationBuilderLinux();
        linuxApp.writeApp();
    }
}
