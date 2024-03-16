
```
import sys

def bubbleCount(a, l, r):
    if r - l <= 1:
        return 0
    m = (l + r) // 2
    ret = bubbleCount(a, l, m) + bubbleCount(a, m, r)
    temp = a[l:r]
    p0 = 0
    p1 = m - l
    p = l
    while p < r:
        if p0 == m - l:
            a[p] = temp[p1]
            p1 += 1
            p += 1
        elif p1 == r - l:
            a[p] = temp[p0]
            p0 += 1
            p += 1
        elif temp[p0] <= temp[p1]:
            a[p] = temp[p0]
            p0 += 1
            p += 1
        else:
            a[p] = temp[p1]
            p1 += 1
            p += 1
            ret += m - l - p0
    return ret

def solve():
    s = input()
    n = len(s)
    idx = [0] * 26
    for i in range(n):
        c = ord(s[i]) - ord('a')
        idx[c] += 1
    a = [[] for i in range(26)]
    for i in range(26):
        a[i] = [0] * idx[i]
    map = [-1] * n
    ptr = [0] * 26
    now = 0
    oddUsed = -1
    for i in range(n):
        c = ord(s[i]) - ord('a')
        odd = idx[c] % 2 == 1
        if odd and oddUsed >= 0 and oddUsed != c:
            print(-1)
            return
        p = ptr[c]
        if p < idx[c] // 2:
            map[i] = now
            now += 1
        elif odd and p == idx[c] // 2:
            map[i] = n // 2
            oddUsed = c
        else:
            inv = idx[c] - p - 1
            map[i] = n - a[c][inv] - 1
        a[c][p] = map[i]
        ptr[c] += 1
    array = [0] * n
    for i in range(n):
        array[map[i]] = i
    x = bubbleCount(array, 0, n)
    print(x)

def main():
    if len(sys.argv) > 1:
        sys.stdin = open(sys.argv[1])
    solve()

if __name__ == '__main__':
    main()
```

## 03484 - 
[03484 - ](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3485)

### 题意
给定一个字符串，求出所有子串中，字典序最小
