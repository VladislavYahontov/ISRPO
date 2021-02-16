package task4_2;

public class task4_2 {
    public static void main(String[] args) {
        double ranndomnie_chisla[] = new double[10];
        int a = 0; // Начальное значение диапазона - "от"
        int b = 3; // Конечное значение диапазона - "до"
        int i, kol2=0, kol3=0, kol3chetn=0, kol2do5=0;
        for (i=0; i<10;i++)
        {
            ranndomnie_chisla[i]= a + (int) (Math.random() * b);
            System.out.printf("\n Чётное число %.0f", ranndomnie_chisla[i]);
            if (ranndomnie_chisla[i]==2)
            {
                kol2++;
                if (i<6)
                {
                    kol2do5++;
                }
            }
            if (ranndomnie_chisla[i]==3)
            {
                kol3++;
                if (i % 2 == 0)
                {
                    kol3chetn++;
                }
            }

        }
        System.out.printf("\n Количество двоек = %S", kol2);
        System.out.printf("\n Количество троек = %S", kol3);
        if (kol2 > kol3)
        {
            System.out.printf("\n а) Количество двоек больше троек на %S", kol2-kol3);
        }
        if (kol3 > kol2)
        {
            System.out.printf("\n а) Количество троек больше двоек на %S", kol3-kol2);
        }
        System.out.printf("\n б) Количество троек на чётных местах = %S", kol3chetn);
        System.out.printf("\n в) Количество двоек среди первых пяти чисел серии %S", kol2do5);

    }
}
