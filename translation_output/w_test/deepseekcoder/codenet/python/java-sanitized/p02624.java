import java.util.Scanner;

public class p02624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfDivisors(n));
    }

    private static long sumOfDivisors(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * divCount(i);
        }
        return sum;
    }

    private static long divCount(long n) {
        long total = 1;
        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                long count = 0;
                while (n % p == 0) {
                    n /= p;
                    count++;
                }
                total *= (count + 1);
            }
        }
        if (n > 1) {
            total *= 2;
        }
        return total;
    }
}