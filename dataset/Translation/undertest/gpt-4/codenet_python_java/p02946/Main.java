import java.io.*;
import java.util.*;

public class p02946 {
    private static final int DVSR = 1000000007;

    private static int POW(int x, int y) {
        return (int) Math.pow(x, y) % DVSR;
    }

    private static int INV(int x) {
        return POW(x, DVSR - 2);
    }

    private static int DIV(int x, int y) {
        return (int) ((long) x * INV(y) % DVSR);
    }

    private static int gcd(int x, int y) {
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }
        int div = x % y;
        while (div != 0) {
            x = y;
            y = div;
            div = x % y;
        }
        return y;
    }

    private static List<Integer> FLIST(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= n; i++)
            res.add((int) ((long) res.get(i - 1) * i % DVSR));
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        int K = Integer.parseInt(inputs[0]);
        int X = Integer.parseInt(inputs[1]);

        for (int i = Math.max(X - K + 1, -1000000); i < Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        reader.close();
    }
}