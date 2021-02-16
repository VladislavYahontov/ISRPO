package task5_1;

import java.util.Random;

public class task5_1 {
    public static void main(String[] args) {
        Random r = new Random();
        char c ='a';
        int k=0;
        // Закомментированные строки делают отсчёт строк и столбцов более удобным. Советую Вам их раскомментировать
       // System.out.printf("  1 2 3 4 5 6 7\n");
        for (int i = 0; i < 7; i++) {
            k++;
          //  System.out.printf("%S ",k);
            System.out.printf("%S ", (c = (char) (r.nextInt(26) + 'a'))," ");
            System.out.printf("%S ", (c = (char) (r.nextInt(26) + 'a'))," ");
            System.out.printf("%S ", (c = (char) (r.nextInt(26) + 'a'))," ");
            System.out.printf("%S ", (c = (char) (r.nextInt(26) + 'a'))," ");
            System.out.printf("%S ", (c = (char) (r.nextInt(26) + 'a'))," ");
            System.out.printf("%S ", (c = (char) (r.nextInt(26) + 'a'))," ");
            System.out.printf("%S ", (c = (char) (r.nextInt(26) + 'a'))," ");
            System.out.printf("\n");
        }
    }
}
