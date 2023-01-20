package sdf;

import java.util.Random;
import java.util.Scanner;
import java.net.*;
import java.io.*;

public class App {

    public static void main(String[] args) {

        Random rand = new Random();
        Integer guessNumber = rand.nextInt(100);
        Integer myGuess = 0;

        Scanner input = new Scanner(System.in);

        ServerSocket ss = new ServerSocket(12345);
        Socket s = ss.accept(); // establish connection and wait for client to connect

        try (InputStream is = s.getInputStream()) {
            BufferedInputStream bis = new BufferedInputStream(is);
            DataInputStream dis = new DataInputStream(bis);
            String msgReceived = "";

            try (OutputStream os = s.getOutputStream()) {
                BufferedOutputStream bos = new BufferedOutputStream(os);
                DataOutputStream dos = new DataOutputStream(bos);



        while (myGuess != guessNumber) {
            if (myGuess < guessNumber) {
                System.out.println("The number you guessed is lower");
            } else if (myGuess > guessNumber) {
                System.out.println("The number you guessed is higher");
            } else {
                System.out.println("You guessed it right!");
                System.exit(0);
            }
        }

    }
}