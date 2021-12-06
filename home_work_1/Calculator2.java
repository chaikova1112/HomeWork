package home_work_1;

public class Calculator2 {
    public static void main(String[] args) {
      int a = 8;
      int z = 2;
      int b = 5;

      //2.1
      int sum1 = b + z / a;//сначала 2 / 8 = 0.25+5 ответ 5.25 (5) ( ну это если до сотых считать )
      System.out.println(sum1);

      //2.2
      int sum2 = (b + z)/a;// из-за скобок выполняем сложение первым 5+2 = 7/8= 0,87 (1)
      System.out.println(sum2);

      //2.3
      int sum3 = (b+z++)/a;//d=5+2=7; 7/8=0,87 (0) ; z=3;
        System.out.println(sum3);

      //2.4
      z=2;
      int sum4 = (b+z++)/--a;// x = 5+2+1=8/8-1=8/7=1,14 (1); z=3 ; a=7;
        System.out.println(sum4);

      //2.5
        z=2;
        a=8;
        int sum5 = (b*z >>z++)/--a;//n=5*2 = 10>>3 10/2 три раза =1,25/7=0,17(0); z=3; a=8;
        System.out.println(sum5);

      //2.6
        z=2;
        a=8;
        int sum6 = (b+7 >20 ? 68 : 22 * z >> z++)/--a;// 5+7=12; 12>20 = false =22*2(44) >>2; 44>>2 ,как бы 44/2 2 раза = 11/7 = 1.57(1)
        System.out.println(sum6);

      //2.7
      z=2;
      a=8;
      /* int sum7 = (b+7 > 20 ? 68 > = 68 : 22 * z >> z++) / --c; Ошибка компиляции*/


      //2.8
      boolean sum8 = 6-2 > 3 && 12*12 <=119;//6-2=4; 4>3 true; 12*12 =144 ; 144 <= 119 false ; true&&false;
      System.out.println(sum8);

      //2.9
      boolean sum9 = true&&false; // true&&false = false
      System.out.println(sum9);






    }
}
