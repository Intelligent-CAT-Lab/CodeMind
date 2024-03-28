

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int l = a.length();
        if (l < 6) {
            Set<String> s = new HashSet<>();
            s.add(a);
            Queue<String> q = new LinkedList<>();
            q.add(a);
            int oa = 'a';
            while (!q.isEmpty()) {
                a = q.poll();
                for (int i = 0; i < l - 1; i++) {
                    if (a.charAt(i) != a.charAt(i + 1)) {
                        char t = (char) (oa + 3 - (a.charAt(i) - oa) - (a.charAt(i + 1) - oa));
                        String na = a.substring(0, i) + t + t + a.substring(i + 2);
                        if (!s.contains(na)) {
                            s.add(na);
                            q.add(na);
                        }
                    }
                }
            }
            System.out.println(s.size());
            return;
        }
        String t = a.substring(0, l);
        if (t.equals(a)) {
            System.out.println(1);
            return;
        }
        int x = 0;
        for (char c : a.toCharArray()) {
            if (c == 'b') {
                x++;
            } else if (c == 'c') {
                x += 2;
            }
        }
        int ans = 0;
        if (a.chars().distinct().count() == l) {
            ans++;
        }
        int mod = 998244353;
        int[] dp = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        for (int i = 0; i < l - 1; i++) {
            int s = (dp[10] + dp[11] + dp[12]) % mod;
            dp = new int[]{(dp[3] + dp[6]) % mod, (dp[4] + dp[7]) % mod, (dp[5] + dp[8]) % mod, (dp[2] + dp[8]) % mod, (dp[0] + dp[6]) % mod, (dp[1] + dp[7]) % mod, (dp[1] + dp[4]) % mod, (dp[2] + dp[5]) % mod, (dp[0] + dp[3]) % mod, (dp[0] + dp[5] + dp[7] + s) % mod, (dp[1] + dp[3] + dp[8] + s) % mod, (dp[2] + dp[4] + dp[6] + s) % mod};
        }
        System.out.println((ans + dp[9 + x % 3]) % mod);
    }
}
```


```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = sc.nextInt();
        }
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int[] i = new int[n];
        for (int j = 0; j < n; j++) {
            i[j] = sc.nextInt();
        }
        int[] j = new int[n];
        for (int k = 0; k < n; k++) {
            j[k] = sc.nextInt();
        }
        int[] k = new int[n];
        for (int l = 0; l < n; l++) {
            k[l] = sc.nextInt();
        }
        int[] l = new int[n];
        for (int m = 0; m < n; m++) {
            l[m] = sc.nextInt();
        }
        int[] m = new int[n];
        for (int o = 0; o < n; o++) {
            m[o] = sc.nextInt();
        }
        int[] o = new int[n];
        for (int p = 0; p < n; p++) {
            o[p] = sc.nextInt();
        }
        int[] p = new int[n];
        for (int q = 0; q < n; q++) {
            p[q] = sc.nextInt();
        }
        int[] q = new int[n];
        for (int r = 0; r < n; r++) {
            q[r] = sc.nextInt();
        }
        int[] r = new int[n];
        for (int s = 0; s < n; s++) {
            r[s] = sc.nextInt();
        }
        int[] s = new int[n];
        for (int t = 0; t < n; t++) {
            s[t] = sc.nextInt();
        }
        int[] t = new int[n];
        for (int u = 0; u < n; u++) {
            t[u] = sc.nextInt();
       
