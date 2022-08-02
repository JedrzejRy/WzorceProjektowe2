package templateMethod.before;

public class Main {
    public static void main(String[] args) {
        ApplicationWindowsBuilder appWindow = new ApplicationWindowsBuilder();
        ApplicationLinuxBuilder appLinux = new ApplicationLinuxBuilder();
        appWindow.writeApp();
        appLinux.writeApp();
        
    }
}
