import java.util.Scanner;

public class p03241 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int MN = M / N;
        int[] divisors = makeDivisors(M);
        int maxGCD = 0;
        for (int d : divisors) {
            if (d <= MN && d >= maxGCD) {
                maxGCD = d;
            }
        }
        System.out.println(maxGCD);
    }

    public static int[] makeDivisors(int n) {
        int[] divisors = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors[i] = i;
                if (i != n / i) {
                    divisors[n / i] = n / i;
                }
            }
        }
        return divisors;
    }
}