package home_work_1;

public class Operators1 {
    public static void main(String[] args) {

        int a = 42;	/* 42 = 0010 1010 */
        int b = 15;	/* 15 = 0000 1111 */
        int c = 0;

        c = a & b;       /* 10 = 0000 1010 */
        System.out.println("a & b = " + c );

        c = a | b;       /* 47 = 0010 1111 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 37 = 0010 0101 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-43 = 1101 0101 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 168 = 1010 1000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 10 =  1010 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     /* 10 = 0000 1010 */
        System.out.println("a >>> 2 = " + c );



    }
}
