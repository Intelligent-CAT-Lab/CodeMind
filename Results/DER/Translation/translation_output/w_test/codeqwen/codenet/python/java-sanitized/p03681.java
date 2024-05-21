import java.util.Scanner;

public class p03681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println((factorial(N) * factorial(M) * 2) % 1000000007);
        } else {
            System.out.println((factorial(N) * factorial(M)) % 1000000007);
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % 1000000007;
        }
        return result;
    }
}