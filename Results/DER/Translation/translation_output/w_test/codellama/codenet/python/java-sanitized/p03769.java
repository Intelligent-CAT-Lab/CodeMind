import java.util.Scanner;

public class p03769 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        int[] fact = new int[101];
        fact[0] = 1;
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1] * i;
        }

        int[][] C = new int[101][101];
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= i; j++) {
                C[i][j] = fact[i] / (fact[j] * fact[i - j]);
            }
        }

        int[][] sC = new int[101][101];
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= i; j++) {
                sC[i][j] = 0;
                for (int k = 0; k <= Math.min(i, j); k++) {
                    sC[i][j] += C[i][k] * C[j][k];
                }
            }
        }

        int[] X = new int[n];
        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }

        X[0] = k;
        int rem = n - ((1 << i) - 1);
        k++;
        i++;
        int j = i / 2;

        while (j > 0) {
            while (true) {
                int tmp = sC[i][j];
                if (tmp <= rem) {
                    X[j] = k;
                    X[i - j] = k;
                    rem -= tmp;
                } else {
                    break;
                }
            }
            j--;
        }

        System.out.println(X.length);
        for (int x : X) {
            System.out.print(x + " ");
        }
    }
}