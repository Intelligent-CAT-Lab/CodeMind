import java.util.Scanner;

public class p02624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfDivisors(n));
    }

    public static long sumOfDivisors(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (n / i);
        }
        return sum;
    }
}