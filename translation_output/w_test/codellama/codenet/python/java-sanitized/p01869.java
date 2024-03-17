import java.util.Arrays;
import java.util.Scanner;

public class p01869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            System.out.println(-1);
            return;
        }
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i * 2 + 1;
            b[i] = i * 2 + 2;
        }
        int[] sortedA = Arrays.stream(a).sorted().toArray();
        int[] sortedB = Arrays.stream(b).sorted().toArray();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (sortedA[i] * sortedA[i] > n) {
                break;
            }
            if (n % sortedA[i] == 0) {
                max = Math.max(max, g(n / sortedA[i], i));
            }
        }
        System.out.println(max);
    }

    public static int g(int n, int p) {
        if (n == 1) {
            return 1;
        }
        int m = -1 << 20;
        for (int i = p; i < n; i++) {
            if (n % a[i] == 0) {
                m = Math.max(m, g(n / a[i], i));
            }
        }
        return m;
    }
}