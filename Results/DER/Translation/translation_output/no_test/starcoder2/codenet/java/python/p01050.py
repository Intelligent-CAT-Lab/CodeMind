
```

s = input()
sd = "abcdefghijklmnopqrstuvwxyz"
sdnum = "0123456789"
count = [0] * 26
countnum = [0] * 10

for i in range(len(s)):
    if s[i] >= '0' and s[i] <= '9':
        countnum[ord(s[i]) - ord('0')] += 1
    if s[i] >= 'a' and s[i] <= 'z':
        count[ord(s[i]) - ord('a')] += 1

ans = 0
for i in range(26, 2, -1):
    for j in range(26 - i + 1):
        tmp = 10000
        for k in range(j, j + i):
            tmp = min(tmp, count[k])
        ans += tmp * 3
        for k in range(j, j + i):
            count[k] -= tmp
for i in range(26):
    ans += count[i]

for i in range(10, 2, -1):
    for j in range(10 - i + 1):
        tmp = 10000
        for k in range(j, j + i):
            tmp = min(tmp, countnum[k])
        ans += tmp * 3
        for k in range(j, j + i):
            countnum[k] -= tmp
for i in range(10):
    ans += countnum[i]

print(ans)

```

## 01051

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p01051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int o = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int u = sc.nextInt();
        int v = sc.nextInt();
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int e1 = sc.nextInt();
        int f1 = sc.nextInt();
        int g1 = sc.nextInt();
        int h1 = sc.nextInt();
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        int k1 = sc.nextInt();
        int l1 = sc.nextInt();
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int o1 = sc.nextInt();
        int p1 = sc.nextInt();
        int q1 = sc.nextInt();
        int r1 = sc.nextInt();
        int s1 = sc.nextInt();
        int t1 = sc.nextInt();
        int u1 = sc.nextInt();
        int v1 = sc.nextInt();
        int w1 = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int e2 = sc.nextInt();
        int f2 = sc.nextInt();
        int g2 = sc.nextInt();
        int h2 = sc.nextInt();
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();
        int k2 = sc.nextInt();
        int l2 = sc.nextInt();
        int m3 = sc.nextInt();
        int n3 = sc.nextInt();
        int o2 = sc.nextInt();
        int p2 = sc.nextInt();
        int q2 = sc.nextInt();
        int r2 = sc.nextInt();
        int s2 = sc.nextInt();
        int t2 = sc.nextInt();
        int u2 = sc.nextInt();
        int v2 = sc.nextInt();
        int w2 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = sc.nextInt();
        int d3 = sc.nextInt();
        int e3 = sc.nextInt();
        int f3 = sc.nextInt();
        int g3 = sc.nextInt();
        int h3 = sc.nextInt();
        int i3 = sc.nextInt();
        int j3 = sc.nextInt();
        int k3 = sc.nextInt();
        int l3 = sc.nextInt();
        int m4 = sc.nextInt();
        int n4 = sc.nextInt();
        int o3 = sc.nextInt();
        int p3 = sc.nextInt();
        int q3 = sc.nextInt();
        int r3 = sc.nextInt();
        int s3 = sc.nextInt();
        int t3 = sc.nextInt();
        int u3 = sc.
