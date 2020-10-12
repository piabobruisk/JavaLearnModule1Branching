package by.epam.pia.learning.fundamentals.branching;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
//Определить, будут ли они расположены на одной прямой.

/**
Если 3 точки лежат на 1 прямой, то площать треугольника
образуемого ими равна 0.
Площадь треугольника по 3 точкам:
        S=1/2 * |(x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)|
Из этого уравнения площадь равна 0 при следующем условии:
        (x2-x1)*(y3-y1)=(x3-x1)*(y2-y1)
эту формулу можно преобразовать так:
        (x1-x3)/(x2-x3) = (y1-y3)/(y2-y3)
а это уже метод :-)
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;

        System.out.println("Введите точки");
        x1 = input("A x1=");
        y1 = input("A y1=");
        System.out.println("");
        x2 = input("B x2=");
        y2 = input("B y2=");
        System.out.println("");
        x3 = input("C x3=");
        y3 = input("C y3=");

        if (Math.abs(formula(x1,x2,x3)-formula(y1,y2,y3))<0.000001) {
            System.out.println("Точки лежат на одной прямой");
        }else {
            System.out.println("Точки не пренадлежат одной прямой");
        }
    }

    private static double formula (int x1, int x2, int x3){
        return (double) (x1-x3)/(x2-x3);
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
