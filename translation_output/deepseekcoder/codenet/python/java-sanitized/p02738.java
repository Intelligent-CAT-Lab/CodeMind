import java.util.Scanner;

public class p02738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1, k = i - 2;
            d[i] = ((d[i-3][k] + roll(d[k], -1)) * j + roll(d[j], 1)) % M;
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum += d[i][i];
        }
        System.out.println(sum % M);
    }

    public static long[] roll(long[] arr, int shift) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i + shift + arr.length) % arr.length] = arr[i];
        }
        return result;
    }
}