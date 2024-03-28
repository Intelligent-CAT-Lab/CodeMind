
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a*b/2);
    }
}
```

## 2. 1000

### 2.1. 問題

[1000](https://atcoder.jp/contests/abc173/tasks/abc173_a)

### 2.2. 解答

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(1000 - n % 1000);
    }
}
```

## 3. 1001

### 3.1. 問題

[1001](https://atcoder.jp/contests/abc173/tasks/abc173_b)

### 3.2. 解答

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[4];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("AC")) {
                cnt[0]++;
            } else if (s.equals("WA")) {
                cnt[1]++;
            } else if (s.equals("TLE")) {
                cnt[2]++;
            } else {
                cnt[3]++;
            }
        }
        System.out.println("AC x " + cnt[0]);
        System.out.println("WA x " + cnt[1]);
        System.out.println("TLE x " + cnt[2]);
        System.out.println("RE x " + cnt[3]);
    }
}
```

## 4. 1002

### 4.1. 問題

[1002](https://atcoder.jp/contests/abc173/tasks/abc173_c)

### 4.2. 解答

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                c[i][j] = s.charAt(j);
            }
        }
        int ans = 0;
        for (int i = 0; i < (1 << h); i++) {
            for (int j = 0; j < (1 << w); j++) {
                int cnt = 0;
                for (int l = 0; l < h; l++) {
                    for (int m = 0; m < w; m++) {
                        if (((i >> l) & 1) == 1 && ((j >> m) & 1) == 1 && c[l][m] == '#') {
                            cnt++;
                        }
                    }
                }
                if (cnt == k) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 5. 1003

### 5.1. 問題

[1003](https://atcoder.jp/contests/abc173/tasks/abc173_d)

### 5.2. 解答

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                ans += a[i];
            } else {
                ans += a[i] * (i + 1);
            }
        }
        System.out.println(ans);
    }
}
```
 1000000007

def main():
    n = int(input())
    a = list(map(int, input().split()))
    ans = 0
    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                if a[i] == a[j] or a[j] == a[k] or a[k] == a[i]:
                    continue
                if a[i] + a[j] > a[k] and a[j] + a[k] > a[i] and a[k] + a[i] > a[j]:
                    ans += 1
    print(ans)

if __name__ == '__main__':
    main()
```

## 5. 1003

### 5.1. 問題

[1003](https://atcoder.jp/contests/abc174/tasks/abc174_d)

### 5.2. 解答

```python
def main():
    n = int(input())
    s = input()
    ans = 0
    for i in range(n):
        if s[i] == 'R':
            ans += i
            break
    print(ans)

if __name__ == '__main__':
    main()
```
/atcoder/abc/abc174/README.md
# AtCoder Beginner Contest 174

## 1. 1000

### 1.1. 問題

[1000](https://atcoder.jp/contests/abc174/tasks/abc174_a)

### 1.2. 解答

```python
def main():
    x = int(input())
    print('Yes' if x >= 30 else 'No')

if __name__ == '__main__':
    main()
```

## 2. 1001

### 2.1. 問題

[1001](https://atcoder.jp/contests/abc174/tasks/abc174_b)

### 2.2. 解答

```python
import math

def main():
    n, d = map(int, input().split())
    ans = 0
    for
