
```java
import java.util.*;
import java.io.*;

public class Main {
    static int n, k;
    static boolean ok(long m) {
        long s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt++;
            if (s > k) return false;
            if (cnt == n) break;
            m >>= 1;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        long l = 0, r = k + 1;
        while (l + 1 < r) {
            long m = (l + r) / 2;
            if (ok(m)) l = m;
            else r = m;
        }
        System.out.println(l);
    }
}
```


```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;
    static int[] e;
    static int[] f;
    static int[] g;
    static int[] h;
    static int[] i;
    static int[] j;
    static int[] k;
    static int[] l;
    static int[] p;
    static int[] q;
    static int[] r;
    static int[] s;
    static int[] t;
    static int[] u;
    static int[] v;
    static int[] w;
    static int[] x;
    static int[] y;
    static int[] z;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];
        d = new int[n];
        e = new int[n];
        f = new int[n];
        g = new int[n];
        h = new int[n];
        i = new int[n];
        j = new int[n];
        k = new int[n];
        l = new int[n];
        p = new int[n];
        q = new int[n];
        r = new int[n];
        s = new int[n];
        t = new int[n];
        u = new int[n];
        v = new int[n];
        w = new int[n];
        x = new int[n];
        y = new int[n];
        z = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
            e[i] = sc.nextInt();
            f[i] = sc.nextInt();
            g[i] = sc.nextInt();
            h[i] = sc.nextInt();
            i[i] = sc.nextInt();
            j[i] = sc.nextInt();
            k[i] = sc.nextInt();
            l[i] = sc.nextInt();
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
            r[i] = sc.nextInt();
            s[i] = sc.nextInt();
            t[i] = sc.nextInt();
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            z[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            if (a[i] == 1) cnt++;
            if (b[i] == 1) cnt++;
            if (c[i] == 1) cnt++;
            if (d[i] == 1) cnt++;
            if (e[i] == 1) cnt++;
            if (f[i] == 1) cnt++;
            if (g[i] == 1) cnt++;
            if (h[i] == 1) cnt++;
            if (i[i] == 1) cnt++;
            if (j[i] == 1) cnt++;
            if (k[i] == 1) cnt++;
            if (l[i] == 1) cnt++;
            if (p[i] == 1) cnt++;
            if (q[i] == 1) cnt++;
            if (r[i] == 1) cnt++;
            if (s[i] == 1) cnt++;
            if (t[i] == 1) cnt++;
            if (u[i] == 1) cnt++;
            if (v[i] == 1) cnt++;
            if (w[i] == 1) cnt++;
            if (x[i] == 1) cnt++;
            if (y[i] == 1) cnt++;
            if (z[i] == 1) cnt++;
            if (cnt >= m) ans++;
        }
        System.out.println(ans);
    }
}
```

## 2.

```

```

java code:
```java

```
/2020/04/20200426.md
# 20200426

## 1.

```
import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;
    static int[] e;
    static int[] f;
    static int[] g;
    static int[] h;
    static int[] i;
    static int[] j;
    static int[] k;
    static int[] l;
    static int[] p;
    static int[] q;
    static int[] r;
    static int[] s;
    static int[] t;
    static int[] u;
    static int[] v;
    static int[] w;
    static int[] x;
    static int[] y;
    static int[] z;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];
        d = new int[n];
        e = new int[n];
        f = new int[n];
        g = new int[n];
        h = new int[n];
        i = new int[n];
        j = new int[n];
        k = new int[n];
        l = new int[n];
        p = new int[n];
        q = new int[n];
        r = new int[n];
        s = new int[n];
        t = new int[n];
        u = new int[n];
        v = new int[n];
        w = new int[n];
        x = new int[n];
        y =
