

```python

n = int(input())
if n == 2:
    print("4 7")
    print("23 10")
    exit()

snt = [0] * (n * 2)
cn = 0
x = 2
while cn < n * 2:
    if isSNT(x):
        snt[cn] = x
        cn += 1
    x += 1

a = [[0] * n for i in range(n)]
for i in range(n):
    for j in range(i % 2, n, 2):
        a1 = (i + j) // 2
        a2 = (j - i + n - 1) // 2 + n
        a[i][j] = snt[a1] * snt[a2]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
for i in range(n):
    for j in range((i + 1) % 2, n, 2):
        gcd = 0
        tich = 1
        for k in range(4):
            if i + dx[k] < 0 or i + dx[k] >= n:
                continue
            if j + dy[k] < 0 or j + dy[k] >= n:
                continue
            if gcd == 0:
                gcd = a[i + dx[k]][j + dy[k]]
                tich = gcd
            else:
                gcd = gcd(tich, a[i + dx[k]][j + dy[k]])
                tich = tich // gcd * a[i + dx[k]][j + dy[k]]
        a[i][j] = tich + 1

for i in range(n):
    for j in range(n):
        print(a[i][j], end=" ")
    print()


def isSNT(x):
    for i in range(2, int(x ** 0.5) + 1):
        if x % i == 0:
            return False
    return True


def gcd(a, b):
    return b if b == 0 else gcd(b, a % b)

```

## Problem 3258

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```


import java.util.Scanner;

public class p03258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int b[] = new int[n];
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++)
            c[i] = sc.nextInt();
        int d[] = new int[n];
        for (int i = 0; i < n; i++)
            d[i] = sc.nextInt();
        int e[] = new int[n];
        for (int i = 0; i < n; i++)
            e[i] = sc.nextInt();
        int f[] = new int[n];
        for (int i = 0; i < n; i++)
            f[i] = sc.nextInt();
        int g[] = new int[n];
        for (int i = 0; i < n; i++)
            g[i] = sc.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++)
            h[i] = sc.nextInt();
        int i[] = new int[n];
        for (int j = 0; j < n; j++)
            i[j] = sc.nextInt();
        int j[] = new int[n];
        for (int j2 = 0; j2 < n; j2++)
            j[j2] = sc.nextInt();
        int k[] = new int[n];
        for (int j2 = 0; j2 < n; j2++)
            k[j2] = sc.nextInt();
        int l[] = new int[n];
        for (int j2 = 0; j2 < n; j2++)
            l[j2] = sc.nextInt();
        int m[] = new int[n];
        for (int j2 = 0; j2 < n; j2++)
            m[j2] = sc.nextInt();
        int o[] = new int[n];
        for (int j2 = 0; j2 < n; j2++)
            o[j2] = sc.nextInt();
        int p[] = new int[n];
        for (int j2 = 0; j2 < n; j2++)
            p[j2] = sc.nextInt();
        int q[] = new int[n];
        for (int j2 = 0; j2 < n; j2++)
            q
