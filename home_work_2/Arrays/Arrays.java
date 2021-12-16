package home_work_2.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите внести");


        int[] data = new int[console.nextInt()];

        for (int i = 0; i < data.length; i++) {
            System.out.print("[" + i + "] = " + data[i]);
            if ((i + 1) % 5 == 0) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }
    }
}