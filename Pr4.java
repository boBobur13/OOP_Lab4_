public class Pr4 {
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 20;
        int iterations = 1_000_000;

        long startRecursive = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            factorialRecursive(n);
        }
        long endRecursive = System.currentTimeMillis();

        long startIterative = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            factorialIterative(n);
        }
        long endIterative = System.currentTimeMillis();

        System.out.println("Recursive time: " + (endRecursive - startRecursive) + " ms");
        System.out.println("Iterative time: " + (endIterative - startIterative) + " ms");
    }
}
