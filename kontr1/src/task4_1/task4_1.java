package task4_1;

public class task4_1 {
    public static void main(String[] args) {
        int count = 0, chislo = 0;
        for (int i = 1000; i <= 9999; i++) {
            if (i == sum(i)) {
                count++;
                chislo = i;
            }
        }
        System.out.printf("\nТаких чисел всего %S", count);
        System.out.printf("\nЭто число %S", chislo);
    }

    private static int sum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum * 600;
    }
}
