import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] massiv = new int[30];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(100_000) + 100_000;
        }
        return massiv;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] massiv = generateRandomArray();
        int sum = 0;
        for (int i : massiv) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] massiv = generateRandomArray();
        int max = -1;
        int min = 2000000000;
        for (int i : massiv) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] massiv = generateRandomArray();
        int sum = 0;
        for (int i : massiv) {
            sum = sum + i;
        }
        int average = sum / massiv.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseName.length/2; i++) {
            char n = reverseName[i];
            reverseName[i] = reverseName[reverseName.length - i - 1];
            reverseName[reverseName.length - i - 1] = n;
        }
        System.out.print(reverseName);
    }
}