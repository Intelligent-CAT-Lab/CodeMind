import java.util.Scanner;

public class p02467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n + ": ");
        for (int p : primeFactorization(n)) {
            System.out.print(p + " ");
        }
    }

    public static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[]{n};
        }

        int[] res = new int[0];
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res = add(res, p);
                n /= p;
            }
        }

        if (n > 1) {
            res = add(res, n);
        }

        return res;
    }

    public static int[] add(int[] arr, int val) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        res[arr.length] = val;
        return res;
    }
}