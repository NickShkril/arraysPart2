package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // 1st
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i]; {
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // 2nd
        int[] arr2 = generateRandomArray();
        int min = arr2[0];
        for (int a = 0; a < arr2.length; a++) {
            if (min > arr2[a]) {
                min = arr2[a];
            }

            int[] arr22 = generateRandomArray();
            int max = arr22[0];
            for (a = 0; a < arr22.length; a++) {
                if (max < arr22[a]) {
                    max = arr22[a];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        }

        //3rd
        int[] arr3 = generateRandomArray();
        float sum1 = 0;
        for (int i = 0; i < arr3.length; i++)
            sum1 += arr[i];
        float mid = sum1 / arr3.length;
        {
            System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");
        }

        //4th
        char[] rev = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = rev.length - 1; i >= 0; i--) {
            System.out.print(rev[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_100) + 100_000;
        }
        return arr;
    }

}

