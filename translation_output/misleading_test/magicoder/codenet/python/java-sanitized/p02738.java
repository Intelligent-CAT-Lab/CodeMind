import java.util.Scanner;

public class p02738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long M = scanner.nextLong();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1, k = i - 2;
            d[i] = ((d[i - 3][k] * k + roll(d[k], -1)) * j + roll(d[j], 1)) % M;
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum = (sum + d[l - 1][i]) % M;
        }
        System.out.println(sum);
    }

    private static long[] roll(long[] arr, int shift) {
        int len = arr.length;
        long[] result = new long[len];
        for (int i = 0; i < len; i++) {
            result[(i + shift + len) % len] = arr[i];
        }
        return result;
    }
}