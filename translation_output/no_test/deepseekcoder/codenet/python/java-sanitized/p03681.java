import java.util.Scanner;

public class p03681 {
    public static void main(String[] args) {
        final long MAX = (long)Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println(factorial(N, MAX) * factorial(M, MAX) * 2 % MAX);
        } else {
            System.out.println(factorial(N, MAX) * factorial(M, MAX) % MAX);
        }
    }

    public static long factorial(int num, long max) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result = (result * i) % max;
        }
        return result;
    }
}