

```python
def solve():
    a, b = map(int, input().split())
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

print(solve())
```

## B - Growing Plant

```python
def solve():
    n = int(input())
    h = list(map(int, input().split()))
    ans = 0
    max_h = 0
    for i in range(n):
        if max_h <= h[i]:
            ans += 1
            max_h = h[i]
    return ans

print(solve())
```

## C - Coloring Colorfully

```python
def solve():
    s = input()
    n = len(s)
    ans = 0
    for i in range(n):
        if i % 2 == 0:
            if s[i] == '0':
                ans += 1
        else:
            if s[i] == '1':
                ans += 1
    return ans

print(solve())
```

## D - Handstand

```python
def solve():
    n, k = map(int, input().split())
    s = input()
    ans = 0
    for i in range(n):
        if s[i] == '1':
            ans += 1
    return ans

print(solve())
```

## E - Lunlun Number

```python
def solve():
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = list(map(int, input().split()))
    d = list(map(int, input().split()))
    ans = 0
    for i in range(n):
        for j in range(m):
            if a[i] == c[j] and b[i] == d[j]:
                ans += 1
    return ans

print(solve())
```

## F - Lunlun Number 2

```python
def solve():
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = list(map(int, input().split()))
    d = list(map(int, input().split()))
    ans = 0
    for i in range(n):
        for j in range(m):
            if a[i] == c[j] and b[i] == d[j]:
                ans += 1
    return ans

print(solve())
```


```python
def solve():
    n = int(input())
    a = list(map(int, input().split()))
    ans = 0
    for i in range(n):
        if a[i] % 2 == 0:
            if a[i] % 3 != 0 and a[i] % 5 != 0:
                ans += 1
    return ans

print(solve())
```

## D - Handstand

```python
def solve():
    n, k = map(int, input().split())
    s = input()
    ans = 0
    for i in range(n):
        if s[i] == '1':
            ans += 1
    return ans

print(solve())
```

## E - Lunlun Number

```python
def solve():
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = list(map(int, input().split()))
    d = list(map(int, input().split()))
    ans = 0
    for i in range(n):
        for j in range(m):
            if a[i] == c[j] and b[i] == d[j]:
                ans += 1
    return ans

print(solve())
```

## F - Lunlun Number 2

```python
def solve():
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = list(map(int, input().split()))
    d = list(map(int, input().split()))
    ans = 0
    for i in range(n):
        for j in range(m):
            if a[i] == c[j] and b[i] == d[j]:
                ans += 1
    return ans

print(solve())
```
/atcoder/ABC124/README.md
# AtCoder Beginner Contest 124

## A - Buttons

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 6

Expected output:
12


```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC124_A {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            return a * 2;
        } else if (a > b) {
            return a * 2 - 1;
        } else {
            return b * 2 - 1;
        }
    }
}
```

python code:

```python
def solve():
    a, b = map(int, input().split())
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

print(solve())
```

## B - Growing Plant

```python
def solve():
    n = int(input())
    h = list(map(int, input().split()))
    ans = 0
    max_h = 0
    for i in range(n):
        if max_h <= h[i]:
            ans += 1
            max_h = h[i]
    return ans

print(solve())
```

## C - Coloring Colorfully

```python
def solve():
    s = input()
    n = len(s)
    ans = 0
    for i in range(n):
        if i % 2 == 0:
            if s[i] == '0':
                ans += 1
        else:
            if s[i] == '1':
                ans += 1
    return ans

print(solve())
```

## D - Handstand/atcoder/ABC123/README.md
# AtCoder Beginner Contest 123

## A - Five Antennas

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 6

Expected output:
12


```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC123_A {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int k = sc.nextInt();
        if (e - a <= k) {
            return "Yay!";
        } else {
            return ":(";
        }
    }
}
```

python code:

```python
def solve():
    a, b, c, d, e, k = map(int, input().split())
    if e - a <= k
