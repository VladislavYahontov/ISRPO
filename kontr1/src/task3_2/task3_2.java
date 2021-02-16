package task3_2;
import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {

        int i, k=0, naibchislo = 0, kol=0;
        int chisla[] = new int[4];
        int chetnie_chisla[] = new int[4];

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число1= ");
        chisla[0] = in.nextInt();
        System.out.print("Введите число2= ");
        chisla[1] = in.nextInt();
        System.out.print("Введите число3= ");
        chisla[2] = in.nextInt();
        System.out.print("Введите число4= ");
        chisla[3] = in.nextInt();

        for (i=0; i<4; i++) {
            if (chisla[i] % 2 == 0)
            {
            chetnie_chisla[k]=chisla[i];
            System.out.printf("\n Чётное число %S", chetnie_chisla[k]);
            k++;
            kol++;
        }
        }

        if (kol!=0) {
            System.out.printf("\n Всего чётных чисел %S", kol);
            k=0;
          naibchislo = chetnie_chisla[0];
            for (i = 0; i < kol; i++) {
                if (chetnie_chisla[i] > chetnie_chisla[k]) {
                    naibchislo = chetnie_chisla[i];
                    k++;
                }
            }
            System.out.printf("\n Наибольшее чётное число  %S", naibchislo);
        }
        else
        {
            System.out.printf("\n not found");
        }
    }
}
