import java.util.*;
public class p01883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[50000];
        a[0] = 1;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }
        int t = Arrays.binarySearch(a, n);
        int[] r = new int[t * 2];
        for (int i = 0; i < t; i++) {
            r[i] = 1;
        }
        for (int i = t; i < t * 2; i++) {
            r[i] = 0;
        }
        for (int i = t - 1; i >= 0; i--) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r[ti] = r[ti - ts];
                r[ti - ts] = 0;
                n -= t - ts;
            } else {
                break;
            }
        }
        for (int i = 0; i < t * 2; i++) {
            System.out.print(r[i] == 1? "(" : ")");
        }
    }
}