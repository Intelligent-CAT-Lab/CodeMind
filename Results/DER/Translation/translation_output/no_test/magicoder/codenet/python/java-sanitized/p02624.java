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

    private static int divCount(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)
                    count += 1;
                else
                    count += 2;
            }
        }
        return count;
    }
}