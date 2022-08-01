package strategy.before;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Boxer rocky = new Boxer("Rocky");
        System.out.println("Jestem " +rocky.getName());
        rocky.leftPunch();
        rocky.rightPunch();
    }
}
