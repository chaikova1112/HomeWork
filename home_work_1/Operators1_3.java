package home_work_1;

public class Operators1_3 {
    public static void main(String[] args) {
        int a = -42;	/* - 42 = 1101 0110 */
        int b = -15;	/* -15 = 1111 0001 */
        int c = 0;

        c = a & b;       /* -48 = 1101 0001 */
        System.out.println("a & b = " + c );

        c = a | b;       /* -9 = 1111 0111 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 39 = 0010 0111  */
        System.out.println("a ^ b = " + c );

        c = ~a;          /* 41 = 0010 1001 */
        System.out.println("~a = " + c );

        c = a << 2;     /* -168 = 0101 1001 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* - 11 = 1111 0101 */
        System.out.println("a >> 2  = " + c );

        c =  a >>> 30;     /* 3 = 0000 0011 */
        System.out.println("a >>> 2 = " + c );

    }
}
