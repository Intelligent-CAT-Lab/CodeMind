import java.util.Scanner;

public class p02467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.print(n + ": ");
        for (int p : primeFactorization(n)) {
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static int[] primeFactorization(int n) {
        if (n < 2) {
            return new int[] { n };
        }

        int[] res = new int[0];
        int lim = (int) Math.sqrt(n);

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

    public static int[] append(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = value;
        return newArr;
    }
}