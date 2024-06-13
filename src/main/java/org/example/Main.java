package org.example;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner strScanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger("myLogger");


    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("""
                    0 exit
                    1 sign in
                    2 sign up
                    """);
            switch (scanner.nextInt()) {
                case 0 -> {
                    System.out.println("see you");
                }
                case 1 -> {
                    System.out.println("enter username");
                    String username = strScanner.nextLine();
                    System.out.println("enter password");
                    String password = strScanner.nextLine();
                    LogRecord logRecord = new LogRecord(Level.INFO, String.format("username = %s, password = %s, shunday user tizimga kirdi", username, password));
                    logger.log(logRecord);
                }
                case 2 -> {
                    System.out.println("enter username");
                    String username = strScanner.nextLine();
                    System.out.println("enter password");
                    String password = strScanner.nextLine();
                    logger.log(Level.FINEST, String.format("username = %s, password = %s, shunday user ro'yxatdan o'tdi", username, password));
                }
            }
        }


    }
}


























