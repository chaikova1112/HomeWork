package home_work_2.Loops;

import java.util.Scanner;

public class Loops_1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(args [0]);

        if(s.hasNextLong()){
            long value = s.nextLong();

            long add = 1;

            long num = value;

            int partsCount = 0;

            do{
                num = num /10;
                partsCount++;
            } while (num != 0);

                num = value;

            long [] parts = new long[partsCount];

            for (int i = parts.length -1; i > -1 ; i--) {
                parts[i] = num % 10;
                num /= 10;

            }
            for (int i = 0; i < parts.length; i++) {
                System.out.print(parts[i]);
                if (i != parts.length - 1) {
                    System.out.print(" * ");
                }
                add *= parts[i];
            }


                System.out.println(" = " + add );
                System.out.println(" Вы ввели число " + value);
            } else if(s.hasNextDouble()){
                System.out.println("Введено не целое число ");
            }else {
                System.out.println("Введено не число");

            }

        }
    }


