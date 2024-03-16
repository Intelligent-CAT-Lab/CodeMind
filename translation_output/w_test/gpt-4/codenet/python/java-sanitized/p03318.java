import java.util.Scanner;

public class p03318 {
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int K = in.nextInt();
        solveD(K);
    }

    public static void solveD(int K) {
        long ans = 1;
        int i = 0;
        while (K > 0) {
            System.out.println(ans);
            K -= 1;
            if (check(ans, i)) {
                i++;
            }
            ans += Math.pow(10, i);
        }
    }

    private static double sunuke(long a) {
        return (double) a / sumOfDigits(a);
    }

    private static int sumOfDigits(long a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    private static boolean check(long ans, int i) {
        return sunuke(ans + (long) Math.pow(10, i)) > sunuke(ans + (long) Math.pow(10, i + 1));
    }
}