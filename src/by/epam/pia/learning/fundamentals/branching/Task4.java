package by.epam.pia.learning.fundamentals.branching;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//Определить, пройдет ли кирпич через отверстие.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int a;
        int b;
        int x;
        int y;
        int z;

        int i;

        System.out.println("Введите размер отверстия");
        a = input("A=");
        b = input("B=");

        System.out.println("Введите размеры кирпича");
        x = input("x=");
        y = input("y=");
        z = input("z=");

        i=0;

        if (isBrickPasses(a,b,x,y)) i++;
        if (isBrickPasses(a,b,x,z)) i++;
        if (isBrickPasses(a,b,y,z)) i++;

        if (i==0) {
            System.out.println("Кирпич не пройдет в отверстие");
        }else{
            System.out.println("Количество сторон которыми кирпич пройдет в отверстие:"+i);
        }


    }

private static boolean isBrickPasses(int a, int b , int x, int y){
        /*if (min (a,b) >= min(x,y)  && max (a,b) >= max(x,y)  ) return true;
        return false;*/
        return Math.min(a, b) >= Math.min(x, y) && Math.max(a, b) >= Math.max(x, y);
}

    /*private static int min(int x, int y) {
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
    }*/


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
