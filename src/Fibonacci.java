import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findFib(n));
    }

    private static int findFib(int n) {
        if (n <= 1) {
            return n;
        }
        return findFib(n - 1) + findFib(n - 2);
    }
}
