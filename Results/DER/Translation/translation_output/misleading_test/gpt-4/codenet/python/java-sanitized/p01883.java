import java.util.*;
import java.io.*;

public class p01883 {
    static int[] a = new int[50000];
    static {
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }
    }

    public static int findIndex(int n) {
        int index = Arrays.binarySearch(a, n);
        if (index < 0) {
            index = -index - 1;
        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();

        int t = findIndex(n);
        result.append(String.join("", Collections.nCopies(t, "(")));
        result.append(String.join("", Collections.nCopies(t, ")")));
        char[] r = result.toString().toCharArray();

        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                char temp = r[ti];
                r[ti] = r[ti - ts];
                r[ti - ts] = temp;
                n -= t - ts;
            } else {
                break;
            }
        }

        System.out.println(new String(r));
    }
}