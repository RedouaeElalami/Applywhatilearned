package codingGame;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                System.out.println(i);
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println("9"); // The index of the mountain to fire on.
        }
        // redouane
    }
}

