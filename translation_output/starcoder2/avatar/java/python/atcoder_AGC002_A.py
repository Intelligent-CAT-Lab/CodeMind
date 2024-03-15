
```
a, b = map(int, input().split())
if a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    if (b - a + 1) % 2 == 0:
        print("Positive")
    else:
        print("Negative")
else:
    print("Positive")
```

## 2. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_AGC002_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt() - 1;
            y[i] = sc.nextInt() - 1;
        }

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = 1;
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = 1;
        }
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = 1;
        }

        for (int i = 0; i < m; i++) {
            if (c[x[i]] == 0) {
                c[y[i]] = 0;
            } else if (c[y[i]] == 0) {
                c[x[i]] = 0;
            } else {
                c[x[i]]--;
                c[y[i]]--;
                if (c[x[i]] == 0) {
                    d[x[i]] = 0;
                }
                if (c[y[i]] == 0) {
                    d[y[i]] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (d[i] == 1) {
                e[i] = 0;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (e[i] == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
n, m = map(int, input().split())
x = [0] * m
y = [0] * m
for i in range(m):
    x[i], y[i] = map(int, input().split())
    x[i] -= 1
    y[i] -= 1

c = [1] * n
d = [1] * n
e = [1] * n

for i in range(m):
    if c[x[i]] == 0:
        c[y[i]] = 0
    elif c[y[i]] == 0:
        c[x[i]] = 0
    else:
        c[x[i]] -= 1
        c[y[i]] -= 1
        if c[x[i]] == 0:
            d[x[i]] = 0
        if c[y[i]] == 0:
            d[y[i]] = 0

for i in range(n):
    if d[i] == 1:
        e[i] = 0

ans = 0
for i in range(n):
    if e[i] == 1:
        ans += 1
print(ans)
```

## 3. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_AGC002_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] + a[i + 1] >= l) {
                ans = i + 1;
                break;
            }
        }
        if (ans == 0) {
            System.out.println("Impossible");
        } else {
            System.out.println("Possible");
            for (int i = 0; i < ans - 1; i++) {
                System.out.println(i + 1);
            }
            for (int i = n - 1; i > ans; i--) {
                System.out.println(i);
            }
            System.out.println(ans);
        }
    }
}
```

python code:
```
n, l = map(int, input().split())
a = list(map(int, input().split()))

ans = 0
for i in range(n - 1):
    if a[i] + a[i + 1] >= l:
        ans = i + 1
        break

if ans == 0:
    print("Impossible")
else:
    print("Possible")
    for i in range(ans - 1):
        print(i + 1)
    for i in range(n - 1, ans, -1):
        print(i)
    print(ans)
```

## 4. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_AGC002_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt() - 1;
            y[i] = sc.nextInt() - 1;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = 1;
        }

        for (int i = 0; i < m; i++) {
            if (b[x[i]] == 1) {
                b[x[i]] = 0;
                a[x[i]] = y[i];
            } else if (b[y[i]] == 1) {
                b[y[i]] = 0;
                a[y[i]] = x[i];
            }
        }

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (b[i] == 1) {
                c[i] = 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
n, m = map(int, input().split())
x = [0] * m
y = [0] * m
for i in range(m):
    x[i], y[i] = map(int, input().split())
    x[i] -= 1
    y[i] -= 1


