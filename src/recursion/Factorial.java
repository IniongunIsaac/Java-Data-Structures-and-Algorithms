package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(iterative(24));
        System.out.println(recursive(24));
    }

    private static int iterative(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // n! = n * (n - 1)!
    private static int recursive(int num) {
        if (num == 0) {
            return 1;
        }

        return num * recursive(num - 1);
    }
}
