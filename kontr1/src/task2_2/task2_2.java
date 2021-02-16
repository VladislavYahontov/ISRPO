package task2_2;

import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        System.out.print("Введите a -> ");
        Scanner in = new Scanner(System.in);
        float a = in.nextInt();

        System.out.print("Введите b -> ");
        float b = in.nextInt();

        System.out.print("Введите c -> ");
        float c = in.nextInt();


        float old_c,old_b;
        old_c=c;
        c+=a+b;
        old_b=b;
        b=old_c-a;
        a+=old_b;

        System.out.printf("\na= %.0f", a);
        System.out.printf("\nb= %.0f", b);
        System.out.printf("\nc= %.0f", c);
    }
}
