
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        int r = 0;
        int t = (int)Math.pow(10, l);
        for (int[] a : new ArrayList<int[]>(Arrays.asList(new int[l]))) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(n-b), t-Math.abs(n-b));
            if (m > tm) {
                m = tm;
                r = Integer.parseInt(Arrays.toString(a).replaceAll("[^0-9]", ""));
            }
        }
        System.out.println(r);
    }
}

```

## D - 
[abc173_d](https://atcoder.jp/contests/abc173/tasks/abc173_d)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n = I()
    a = LI()
    a.sort(reverse=True)
    ans = 0
    for i in range(n):
        if i % 2 == 0:
            ans += a[i//2]
        else:
            ans += a[i//2+1]
    return ans

print(main())

```

## E - 
[abc173_e](https://atcoder.jp/contests/abc173/tasks/abc173_e)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n, k = LI()
    a = LI()
    a.sort()
    ans = 1
    for i in range(k):
        ans *= a[i]
        ans %= 10**9+7
    return ans

print(main())

```

## F - 
[abc173_f](https://atcoder.jp/contests/abc173/tasks/abc173_f)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n = I()
    a = LI()
    ans = 0
    return ans

print(main())

```

## G - 
[abc173_g](https://atcoder.jp/contests/abc173/tasks/abc173_g)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n = I()
    a = LI()
    ans = 0
    return ans

print(main())

```

## H - 
[abc173_h](https://atcoder.jp/contests/abc173/tasks/abc173_h)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n = I()
    a = LI()
    ans = 0
    return ans

print(main())

```

## I - 
[abc173_i](https://atcoder.jp/contests/abc173/tasks/abc173_i)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n = I()
    a = LI()
    ans = 0
    return ans

print(main())

```

## J - 
[abc173_j](https://atcoder.jp/contests/abc173/tasks/abc173_j)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n = I()
    a = LI()
    ans = 0
    return ans

print(main())

```

## K - 
[abc173_k](https://atcoder.jp/contests/abc173/tasks/abc173_k)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n = I()
    a = LI()
    ans = 0
    return ans

print(main())

```

## L - 
[abc173_l](https://atcoder.jp/contests/abc173/tasks/abc173_l)

### 問題文

### 制約

### 入力

### 解法

### コード

```python
import sys
sys.setrecursionlimit(10**7)

def LI(): return list(map(int, sys.stdin.readline().split()))

def main():
    n = I()
    a = LI()
    ans = 0
    return ans

print(main())

```

## M - 
[abc173_m](https://atcoder.jp/contests/abc173/tasks/abc173_m)

### 問題文

### 制約

###
