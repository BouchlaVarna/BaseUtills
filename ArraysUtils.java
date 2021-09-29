package cz.learning.second;

public class ArraysUtils {
    public static int[] randomNum(int length, int min, int max) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = MathUtils.randomNumBetween(min, max);
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static float average(int[] arr) {
        float average = 0f;
        int i;

        for (i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        return average / i;
    }

    public static int sum(int[] arr) {
        int sumOfNumbers = 0;

        for (int i : arr) {
            sumOfNumbers += i;
        }
        return sumOfNumbers;
    }


    public static char[] cypher(char[] arr, int key, boolean cypher) {
        int num = 97;
        if (!cypher) {
            key *= (-1);
            num = 122;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ((arr[i] + key - num) % 26 + num);
        }
        return arr;
    }
}
