
```java

```

## 2.

## 3.

## 4.

## 5.

## 6.

## 7.

## 8.

## 9.

## 10.

## 11.

## 12.

## 13.

## 14.

## 15.

## 16.

## 17.

## 18.

## 19.

## 20.
/atcoder/abc170/abc170_d.py
import sys
sys.setrecursionlimit(10**7)

def solve(n, a):
    a.sort()
    res = 0
    for i in range(n):
        if i == n - 1 or a[i] != a[i + 1]:
            res += 1
        else:
            j = i + 1
            while j < n and a[j] == a[i]:
                j += 1
            if j == n or a[j] != a[i] * 2:
                res += 1
            i = j - 1
    return res


def main():
    n = int(input())
    a = list(map(int, input().split()))
    res = solve(n, a)
    print(res)


def test():
    assert solve(5, [2, 2, 2, 2, 2]) == 1
    assert solve(5, [2, 2, 2, 2, 3]) == 2
    assert solve(5, [2, 2, 2, 3, 3]) == 3
    assert solve(5, [2, 2, 3, 3, 3]) == 3
    assert solve(5, [2, 3, 3, 3, 3]) == 4
    assert solve(5, [2, 2, 2, 3, 4]) == 3
    assert solve(5, [2, 2, 3, 3, 4]) == 4
    assert solve(5, [2, 2, 3, 4, 4]) == 4
    assert solve(5, [2, 3, 3, 4, 4]) == 4
    assert solve(5, [2, 3, 4, 4, 4]) == 4
    assert solve(5, [2, 2, 3, 4, 5]) == 4
    assert solve(5, [2, 2, 3, 4, 6]) == 4
    assert solve(5, [2, 2, 3, 5, 6]) == 4
    assert solve(5, [2, 2, 4, 5, 6]) == 4
    assert solve(5, [2, 3, 4, 5, 6]) == 5
    assert solve(5, [2, 3, 4, 5, 7]) == 5
    assert solve(5, [2, 3, 4, 6, 7]) == 5
    assert solve(5, [2, 3, 5, 6, 7]) == 5
    assert solve(5, [2, 4, 5, 6, 7]) == 5
    assert solve(5, [3, 4, 5, 6, 7]) == 5
    assert solve(5, [2, 3, 4, 5, 8]) == 5
    assert solve(5, [2, 3, 4, 6, 8]) == 5
    assert solve(5, [2, 3, 5, 6, 8]) == 5
    assert solve(5, [2, 4, 5, 6, 8]) == 5
    assert solve(5, [3, 4, 5, 6, 8]) == 5
    assert solve(5, [2, 3, 4, 7, 8]) == 5
    assert solve(5, [2, 3, 5, 7, 8]) == 5
    assert solve(5, [2, 4, 5, 7, 8]) == 5
    assert solve(5, [3, 4, 5, 7, 8]) == 5
    assert solve(5, [2, 3, 6, 7, 8]) == 5
    assert solve(5, [2, 4, 6, 7, 8]) == 5
    assert solve(5, [3, 4, 6, 7, 8]) == 5
    assert solve(5, [2, 5, 6, 7, 8]) == 5
    assert solve(5, [3, 5, 6, 7, 8]) == 5
    assert solve(5, [4, 5, 6, 7, 8]) == 5
    assert solve(5, [2, 3, 4, 5, 9]) == 5
    assert solve(5, [2, 3, 4, 6, 9]) == 5
    assert solve(5, [2, 3, 5, 6, 9]) == 5
    assert solve(5, [2, 4, 5, 6, 9]) == 5
    assert solve(5, [3, 4, 5, 6, 9]) == 5
    assert solve(5, [2, 3, 4, 7, 9]) == 5
    assert solve(5, [2, 3, 5, 7, 9]) == 5
    assert solve(5, [2, 4, 5, 7, 9]) == 5
    assert solve(5, [3, 4, 5, 7, 9]) == 5
    assert solve(5, [2, 3, 6, 7, 9]) == 5
    assert solve(5, [2, 4, 6, 7, 9]) == 5
    assert solve(5, [3, 4, 6, 7, 9]) == 5
    assert solve(5, [2, 5, 6, 7, 9]) == 5
    assert solve(5, [3, 5, 6, 7, 9]) == 5
    assert solve(5, [4, 5, 6, 7, 9]) == 
