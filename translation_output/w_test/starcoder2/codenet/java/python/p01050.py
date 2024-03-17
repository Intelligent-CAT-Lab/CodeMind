

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

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```

import java.util.Scanner;

public class p01051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; ++i) {
            ans += i;
        }
        System.out.println(ans);
        sc.close();
    }

}


```

python code:

```

n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i
print(ans)

```

## 01052

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```

import java.util.Scanner;

public class p01052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; ++i) {
            ans += i * i;
        }
        System.out.println(ans);
        sc.close();
    }

}


```

python code:

```

n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * i
print(ans)

```

## 01053

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```

import java.util.Scanner;

public class p01053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; ++i) {
            ans += i * i * i;
        }
        System.out.println(ans);
        sc.close();
    }

}


```

python code:

```

n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * i * i
print(ans)

```

## 01054

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```

import java.util.Scanner;

public class p01054 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; ++i) {
            ans += i * i * i * i;
        }
        System.out.println(ans);
        sc.close();
    }

}


```

python code:

```

n = int(input())
ans = 0
for i in range(1, n + 1):
    ans +=
