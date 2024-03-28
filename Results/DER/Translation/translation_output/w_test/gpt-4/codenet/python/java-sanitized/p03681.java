import java.util.Scanner;

public class p03681 {

    private static final int MAX = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();
        
        int diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println((factorial(N) * factorial(M) * 2) % MAX);
        } else {
            System.out.println((factorial(N) * factorial(M)) % MAX);
        }
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % MAX;
        }
        return fact;
    }
}