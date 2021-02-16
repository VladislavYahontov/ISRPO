package task3_1;
import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {

        int chislo, cifra1, cifra2, cifra3, chislo2;
        cifra1 = cifra2 = cifra3 = chislo2 =0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначеное число= ");
        chislo = in.nextInt();

        if (chislo<1000 & chislo>99) {
            cifra1 = chislo/100;
            cifra2 = chislo/10-cifra1*10;
            cifra3 = chislo - cifra1*100 - cifra2*10;
            chislo2 = cifra3*100 + cifra2*10 + cifra1;
            System.out.printf("\nЦифра 1= %S", cifra1);
            System.out.printf("\nЦифра 2= %S", cifra2);
            System.out.printf("\nЦифра 3= %S", cifra3);
            System.out.printf("\nКонечное число= %S", chislo2);
        }
        else
        {
            System.out.print("ОШИБКА!!! НЕВЕРЫНЙ ВВОД.. Попробуйте ещё раз ");
        }
    }
}
