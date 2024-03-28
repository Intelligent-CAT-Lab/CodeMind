import java.util.Scanner;

public class p03681 {
    static final int MAX = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int diff = N - M;

        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println((factorial(N) * factorial(M) * 2) % MAX);
        } else {
            System.out.println((factorial(N) * factorial(M)) % MAX);
        }
    }

    public static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result = ((result % MAX) * (i % MAX)) % MAX;
        }
        return result;
    }
}