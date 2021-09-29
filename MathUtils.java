package cz.learning.second;

public class MathUtils {
    public static double pow(double x) {
        return x * x;
    }

    public static double areaCir(double r) {
        return Math.PI * (pow(r));
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean evenOrOdd(int num) {
        return num % 2 == 0;
    }

    public static boolean primeNum(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int randomNumBetween(int min, int max) {
        return (int) ((max - min) * Math.random() + min);
    }

    public static float squareRoot(float input) {
        float x0, x1;

        for (x0 = input / 2; x0 < 10; x0 += 0.001) {
            x1 = (x0 + (input / x0)) / 2;
            x0 = x1;
            if (input == Math.round(x0 * x0)) return x0;
        }
        return x0;
    }
}
