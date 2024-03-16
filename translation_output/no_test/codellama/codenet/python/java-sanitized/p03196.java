import java.util.Scanner;

public class p03196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int[][] factorization = factorize(p);
        int ans = 1;
        for (int i = 0; i < factorization.length; i++) {
            if (factorization[i][1] >= n) {
                ans *= factorization[i][0] ^ (factorization[i][1] / n);
            }
        }
        System.out.println(ans);
    }

    public static int[][] factorize(int n) {
        int[][] arr = new int[n][2];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr[i] = new int[] { i, cnt };
            }
        }
        if (temp != 1) {
            arr[temp] = new int[] { temp, 1 };
        }
        if (arr.length == 0) {
            arr[n] = new int[] { n, 1 };
        }
        return arr;
    }
}