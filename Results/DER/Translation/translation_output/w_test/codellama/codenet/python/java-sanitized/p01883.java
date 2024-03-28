import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class p01883 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }

        int t = Arrays.binarySearch(a, n);
        int[] r = new int[t];
        Arrays.fill(r, 1);
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r[ti] = r[ti - ts];
                r[ti - ts] = r[ti];
                n -= t - ts;
            } else {
                break;
            }
        }

        String result = IntStream.range(0, r.length)
                .mapToObj(i -> r[i] == 1 ? "(" : ")")
                .collect(Collectors.joining());
        System.out.println(result);
    }
}