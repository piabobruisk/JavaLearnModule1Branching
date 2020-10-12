package by.epam.pia.learning.fundamentals.branching;

//1. Даны два угла треугольника (в градусах). Определить,
//существует ли такой треугольник, и если да, то будет ли он прямоугольным.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int i; // количество параметров для ввода
        int[] angle;
        Scanner scanner;

        i = 3;
        angle = new int[i];
        scanner = new Scanner(System.in);

        for (int j = 0; j < i; j++) {
            System.out.print((j + 1) + " угол=");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
            }
            angle[j] = scanner.nextInt();
        }

        int sum = 180;
        boolean rect = false;

        for (int j = 0; j < i; j++) {
            if (angle[j] == 90) rect = true;
            sum = sum - angle[j];
        }

        if (sum==0) {
            System.out.print("Треугольник существует.");
            if (rect) System.out.println("Он прямоугольный");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}

