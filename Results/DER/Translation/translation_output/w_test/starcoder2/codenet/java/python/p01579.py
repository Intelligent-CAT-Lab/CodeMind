

```python
s = input()
n = len(s)
count = [0] * (2 * n + 1)
now = 0
for i in range(n):
    if s[i] == '(':
        now += 1
    else:
        now -= 1
    count[now + n] += 1

now = 0
ans = 0
for i in range(n):
    if s[i] == '(':
        now += 1
    else:
        now -= 1
    count[now + n] -= 1
    ans += count[now + n]

print(ans)
```

## 01580

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
1 2 3

Expected output:
1 2 3


```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01580 {
    Scanner sc = new Scanner(System.in);

    int INF = 1 << 28;
    double EPS = 1e-9;

    int n;
    int[] a;

    void run() {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        sort(b);
        for (int i = 0; i < n; i++) {
            int idx = lowerBound(b, a[i]);
            println(idx + " ");
        }
    }

    int lowerBound(int[] a, int key) {
        int ng = -1;
        int ok = a.length;
        while (ok - ng > 1) {
            int mid = (ok + ng) / 2;
            if (a[mid] >= key) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    void println(String s) {
        System.out.println(s);
    }

    void print(String s) {
        System.out.print(s);
    }

    void debug(Object... os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        new p01580().run();
    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))

b = a[:]
b.sort()

for i in range(n):
    idx = b.index(a[i])
    print(idx, end=' ')
```

## 01581

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
1 2 3

Expected output:
1 2 3


```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01581 {
    Scanner sc = new Scanner(System.in);

    int INF = 1 << 28;
    double EPS = 1e-9;

    int n;
    int[] a;

    void run() {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        sort(b);
        for (int i = 0; i < n; i++) {
            int idx = lowerBound(b, a[i]);
            println(idx + " ");
        }
    }

    int lowerBound(int[] a, int key) {
        int ng = -1;
        int ok = a.length;
        while (ok - ng > 1) {
            int mid = (ok + ng) / 2;
            if (a[mid] >= key) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    void println(String s) {
        System.out.println(s);
    }

    void print(String s) {
        System.out.print(s);
    }

    void debug(Object... os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        new p01581().run();
    }
}
```

python code:

```python
n = int(input())
a = list(map(int, input().split()))

b = a[:]
b.sort()

for i in range(n):
    idx = b.index(a[i])
    print(idx, end=' ')
```

## 01582

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
1 2 3

Expected output:
1 2 3


```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01582 {
    Scanner sc = new Scanner(System.in);

    int INF = 1 << 28;
    double EPS = 1e-9;

    int n;
    int[] a;

    void run() {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n
