package home_work_2.Loops;

import java.util.Scanner;

public class Loops_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число ");
        double erect = sc.nextDouble();

        System.out.println("Введите второе число");
        int degree = sc.nextInt();

        double result = 1;

        for (int a = 1; a <= degree; a++) {

            result = result * erect;
            double result1 = result;

        }

        System.out.println(+erect+ "^" +degree+ "=" + result);

    }


    }


