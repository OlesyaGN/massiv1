import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Задание 1
        System.out.println(" Задание 1. ");
        int[] arr = generateRandomArray();
        int sum = Arrays.stream(arr).sum();
        System.out.println("Сумма трат за месяц составила "+sum + " рублей.");
        // Задание 2
        System.out.println(" Задание 2.");
        arr = generateRandomArray();
        int maxArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxArr) {
                maxArr=arr[i];
            }

        }
        int minArr=5;
        for (int  u= 0; u< arr.length; u++) {
            if (arr[u]>minArr) {
                minArr=arr[u];
            }

        }
        System.out.println(maxArr);
        // Задание 3
        System.out.println(" Задание 3.");
        arr = generateRandomArray();
        double average=0;
        if (arr.length > 0)
        {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            average = sum / arr.length;
            System.out.println(average);
        }
        //Задание 4
        System.out.println("Задание 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
            if (i!=0){
                System.out.print("");
            }
        }

    }
}

        






