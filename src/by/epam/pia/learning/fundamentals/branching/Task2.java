package by.epam.pia.learning.fundamentals.branching;

//Найти max{min(a, b), min(c, d)}

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        a = input("a=");
        b = input("b=");
        c = input("c=");
        d = input("d=");

        System.out.println(max(min(a, b), min(c, d)));
    }

    private static int min(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    private static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    private static int input(String prompt) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

}
