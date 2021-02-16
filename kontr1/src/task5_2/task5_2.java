package task5_2;

import java.util.Random;
import java.util.Scanner;

public class task5_2 {
    public static void main(String[] args) {
        int ranndom_znach, random_dlina, i, k = 0, a = 0, b = 0, c = 0;
        boolean answer = false;
        String password, random_symbol = null;

        int dlina1 = 6; // Начальное значение диапазона - "от" у длины пароля
        int dlina2 = 20; // Конечное значение диапазона - "до" у длины пароля
        int znach1 = 0; // Начальное значение диапазона - "от" у случайного значения
        int znach2 = 50; // Конечное значение диапазона - "до" у случайного значения
        String[] symbols = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "=", "+", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        do {
            password = "";
            do {
                random_dlina = dlina1 + (int) (Math.random() * dlina2);
            }
            while (random_dlina < 6 || random_dlina > 20);

            for (i = 0; i < random_dlina; i++) {
                ranndom_znach = znach1 + (int) (Math.random() * znach2);
                random_symbol = symbols[ranndom_znach];
                if (random_symbol == "_") {
                    k++;
                }

     /*      if (k==1)
           {
               answer = true;
           } */
                if (random_symbol.matches("A-Z")) {
                    a++;
                }
                if (random_symbol.matches("0-9")) {
                    c++;
                    b++;
                } else {
                    c = 0;
                }
                password += random_symbol;
            }
        }
            //a>0 || a<3 ||
            while (k != 1 || c == 2 || b > 6 || (password.length() > 20 || password.length() < 6)) ;
            System.out.printf("\n Пароль = %S", password);
            System.out.printf("\n Длина  пароля =  %S", password.length());
    }
}
