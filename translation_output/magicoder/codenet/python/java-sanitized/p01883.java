import java.util.*;
import java.io.*;

public class p01883 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static String main() throws IOException {
        int n = nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 1; i < 50000; i++)
            a.add(a.get(i - 1) + i);

        int t = Collections.binarySearch(a, n);
        if (t < 0)
            t = -t - 1;
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 0; i < t; i++)
            r.add(1);
        for (int i = 0; i < t; i++)
            r.add(0);

        for (int i = 0; i < t; i++) {
            int ai = a.get(t - i - 1);
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                Collections.swap(r, ti, ti - ts);
                n -= t - ts;
            } else
                break;
        }

        StringBuilder sb = new StringBuilder();
        for (int x : r)
            sb.append(x == 1 ? '(' : ')');
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(main());
    }
}