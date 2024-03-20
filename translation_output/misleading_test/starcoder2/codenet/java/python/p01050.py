

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

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1

Expected output:
100

```

import java.util.Scanner;

public class p01051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                a[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int tmp = 0;
                for (int k = i; k < n; ++k) {
                    for (int l = j; l < m; ++l) {
                        tmp += a[k][l];
                    }
                }
                ans = Math.max(ans, tmp);
            }
        }

        System.out.println(ans);
        sc.close();
    }

}


```

python code:

```

n, m = map(int, input().split())
a = []
for i in range(n):
    a.append(list(map(int, input().split())))

ans = 0
for i in range(n):
    for j in range(m):
        tmp = 0
        for k in range(i, n):
            for l in range(j, m):
                tmp += a[k][l]
        ans = max(ans, tmp)

print(ans)

```

## 01052

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1

Expected output:
100

```

import java.util.Scanner;

public class p01052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; ++i
