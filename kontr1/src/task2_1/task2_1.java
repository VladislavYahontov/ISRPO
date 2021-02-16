package task2_1;
import java.util.Scanner;

public class task2_1 {

    public static void main(String[] args) {

       double a,b,c,gip,S,P;
       a = b = c = gip = S = P =0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите катет a= ");
        a = in.nextInt();
        System.out.print("Введите катет b= ");
        b = in.nextInt();
        c = Math.sqrt(a*a+b*b);
        S = (a*b)/2;
        P = a+b+c;

        System.out.printf("\nКатет a= %.1f", a);
        System.out.printf("\nКатет b= %.1f", b);
        System.out.printf("\nГипотинуза c= %.1f", c);
        System.out.printf("\nПериметр P= %.1f", P);
        System.out.printf("\nПлощадь S= %.1f", S);
    }
}
