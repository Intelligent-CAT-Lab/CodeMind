Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    static final int cms = 1000000;
    static final int mod = 1000000007;
    static final int[][] dd = {{-1,0},{0,1},{1,0},{0,-1}};
    static final int[][] ddn = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};

    static int[] cm = new int[cms];

    static void comb_init() {
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = (int) ((long) cm[i-1] * i % mod);
        }
    }

    static int comb(int a, int b) {
        return (int) ((long) cm[a] * pow(inv(cm[a-b]), mod) % mod * pow(inv(cm[b]), mod) % mod);
    }

    static int inv(int x) {
        return pow(x, mod - 2);
    }

    static int pow(int x, int y) {
        int res = 1;
        x = x % mod;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % mod;
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }

    static String main() {
        List<String> rr = new ArrayList<>();

        int n, m, k;
        while (true) {
            String[] line = System.console().readLine().split(" ");
            n = Integer.parseInt(line[0]);
            m = Integer.parseInt(line[1]);
            k = Integer.parseInt(line[2]);
            if (n == 0) {
                break;
            }
            rr.add(String.valueOf
