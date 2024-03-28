import java.util.Scanner;

public class p03681 {
    private static final long MAX = 1000000007;

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MAX;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;
        
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            long result = (factorial(N) * factorial(M)) % MAX;
            result = (result * 2) % MAX;
            System.out.println(result);
        } else {
            long result = (factorial(N) * factorial(M)) % MAX;
            System.out.println(result);
        }

        scanner.close();
    }
}