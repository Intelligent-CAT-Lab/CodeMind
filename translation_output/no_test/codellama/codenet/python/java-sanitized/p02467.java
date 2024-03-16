import java.util.Scanner;
import java.lang.Math;

public class p02467 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + ": ");
        System.out.print(primeFactorization(n));
    }

    public static String primeFactorization(int n) {
        if (n < 2) {
            return String.valueOf(n);
        }

        String res = "";
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res += p + " ";
                n /= p;
            }
        }

        if (n > 1) {
            res += n;
        }

        return res;
    }
}