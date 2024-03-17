

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static final int MOD = 1000000007;
    static final int MAX = 100000;
    static int[] fact = new int[MAX+1];
    static int[] ifact = new int[MAX+1];

    static int nCk(int n, int k) {
        if (k < 0 || k > n) return 0;
        return (int)(((long)fact[n] * ifact[n-k] % MOD) * ifact[k] % MOD);
    }

    static int solve(FastReader f) {
        int n = f.nextInt();

        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (int)((long)fact[i-1] * i % MOD);
        }
        ifact[n] = pow(fact[n], MOD-2, MOD);
        for (int i = n-1; i >= 0; i--) {
            ifact[i] = (int)((long)ifact[i+1] * (i+1) % MOD);
        }

        int ans = 0;
        int c0 = 0;
        for (int i = n/2; i < n; i++) {
            int c1 = (int)((((long)nCk(i-1, n-1-i) * fact[i] % MOD) * fact[n-i-1] % MOD) - c0 + MOD) % MOD;
            ans = (int)((ans + (long)c1 * i % MOD) % MOD);
            c0 = (int)((c0 + c1) % MOD);
        }

        return ans;
    }

    static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = (int)((long)res * a % mod);
            a = (int)((long)a * a % mod);
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        FastReader f = new FastReader(args.length > 0 ? args[0] : null);
        if (f.file != null) {
            while (true) {
                System.out.printf("Case #%d\n", f.caseNum);
                System.out.println(solve(f));
                try {
                    f.nextCase();
                } catch (Exception e) {
                    break;
                }
            }
        } else {
            System.out.println(solve(f));
        }
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;
    int caseNum = 1;
    File file;

    public FastReader(String filename) {
        try {
            file = new File(filename);
            br = new BufferedReader(new FileReader(file));
        } catch (Exception e) {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    void nextCase() {
        caseNum++;
    }
}
```
 1000000007;

int solve(FastReader f) {
    int n = f.nextInt();
    int m = f.nextInt();
    int k = f.nextInt();

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = f.nextInt();
    }

    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
        b[i] = f.nextInt();
    }

    int[] c = new int[k];
    for (int i = 0; i < k; i++) {
        c[i] = f.nextInt();
    }

    int ans = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            for (int l = 0; l < k; l++) {
                ans = (ans + (long)a[i] * b[j] % MOD * c[l] % MOD) % MOD;
            }
        }
    }

    return ans;
}

public static void main(String[] args) {
    FastReader f = new FastReader(args.length > 0 ? args[0] : null);
    if (f.file != null) {
        while (true) {
            System.out.printf("Case #%d\n", f.caseNum);
            System.out.println(solve(f));
            try {
                f.nextCase();
            } catch (Exception e) {
                break;
            }
        }
    } else {
        System.out.println(solve(f));
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;
    int caseNum = 1;
    File file;

    public FastReader(String filename) {
        try {
            file = new File(filename);
            br = new BufferedReader(new FileReader(file));
        } catch (Exception e) {
            br = new BufferedReader(new InputStreamReader(
