package by.epam.pia.learning.fundamentals.branching;

//Вычислить значение функции:
// если x<=3
//        x*x-3*x+9
// если x>3
//        1/(x*x*x+6)

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int x;

        x = input("x=");
        System.out.print("Значение функции равно:");

        if (x<=3){
            System.out.println(x*x-3*x+9);
        }else {
            System.out.println(1/(Math.pow(x,3)+6));
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
