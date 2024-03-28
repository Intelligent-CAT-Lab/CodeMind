

```python
import sys

def main():
    ai, ao, at, aj, al, as, az = map(int, sys.stdin.readline().split())
    ans = ao
    if (ai % 2 + aj % 2 + al % 2 == 3):
        ans += ai + aj + al
    elif (ai % 2 + aj % 2 + al % 2 == 2):
        if (ai != 0 and aj != 0 and al != 0):
            ans += ai + aj + al - 1
        else:
            ans += ai + aj + al - 2
    elif (ai % 2 + aj % 2 + al % 2 == 1):
        ans += ai + aj + al - 1
    else:
        ans += ai + aj + al
    print(ans)

if __name__ == '__main__':
    main()
```

## 03841 - 2019-2020 ACM-ICPC, Asia Daejeon Regional Contest, Problem A

### Problem

You are given a sequence of $n$ integers $a_1, a_2, \dots, a_n$.

You have to find the number of pairs of indices $(i, j)$ such that $i < j$ and $a_i \oplus a_j = a_i + a_j$.

### Input

The first line contains a single integer $n$ ($1 \le n \le 10^5$).

The second line contains $n$ integers $a_1, a_2, \dots, a_n$ ($0 \le a_i \le 10^9$).

### Output

Print the number of pairs of indices $(i, j)$ such that $i < j$ and $a_i \oplus a_j = a_i + a_j$.

### Sample

#### Input

```
5
1 2 3 4 5
```

#### Output

```
2
```

### Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    ans = 0
    for i in range(n):
        for j in range(i + 1, n):
            if (a[i] + a[j] == a[i] ^ a[j]):
                ans += 1
    print(ans)

if __name__ == '__main__':
    main()
```

## 03842 - 2019-2020 ACM-ICPC, Asia Daejeon Regional Contest, Problem B

### Problem

You are given a sequence of $n$ integers $a_1, a_2, \dots, a_n$.

You have to find the number of pairs of indices $(i, j)$ such that $i < j$ and $a_i \oplus a_j = a_i - a_j$.

### Input

The first line contains a single integer $n$ ($1 \le n \le 10^5$).

The second line contains $n$ integers $a_1, a_2, \dots, a_n$ ($0 \le a_i \le 10^9$).

### Output

Print the number of pairs of indices $(i, j)$ such that $i < j$ and $a_i \oplus a_j = a_i - a_j$.

### Sample

#### Input

```
5
1 2 3 4 5
```

#### Output

```
2
```

### Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    ans = 0
    for i in range(n):
        for j in range
