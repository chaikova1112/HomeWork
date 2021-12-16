package home_work_2.Loops;

public class Loops_1_5 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");

        printRow(2, 5);
        System.out.println();
        printRow(6, 9);
        System.out.println();
    }

        public static void printRow (int a, int b){ //int a = столбик начала строки, int b = столбик окончания строки
            for (int i = 1; i <=10 ; i++) {
                for (int j = a; j <=b ; j++) {
                    System.out.print( j + " * " + i + " = " + (j * i) + "\t");

                }
                System.out.print("\n");
        }
    }
}

