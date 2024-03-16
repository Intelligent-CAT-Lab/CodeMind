import java.util.Scanner;

public class p02467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%d: ", n);
        for (int p : primeFactorization(n)) {
            System.out.printf("%d ", p);
        }
    }

    private static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int lim = (int) Math.sqrt(n);
        int[] res = new int[0];
        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = append(res, p);
                n /= p;
            }
        }
        if (n > 1) {
            res = append(res, n);
        }
        return res;
    }

    private static int[] append(int[] res, int p) {
        int[] newRes = new int[res.length + 1];
        System.arraycopy(res, 0, newRes, 0, res.length);
        newRes[res.length] = p;
        return newRes;
    }
}