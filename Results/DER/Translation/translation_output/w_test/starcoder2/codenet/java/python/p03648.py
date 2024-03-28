

```python
import sys

def main():
    K = int(sys.stdin.readline())
    A = K // 50
    B = K % 50
    a = [i + A for i in range(50)]
    for i in range(49, 49 - B, -1):
        a[i] += 1
    print(50)
    print(' '.join(map(str, a)))

if __name__ == '__main__':
    main()
```

## 03649 - 2018 ACM-ICPC Asia Daejeon Regional Contest

### Problem

You are given a sequence of integers $a_1, a_2, \cdots, a_n$.

You can perform the following operation at most once:

- Choose an integer $x$ and replace all $a_i$ with $a_i + x$.

Find the minimum possible sum of $a_i$ after performing the operation at most once.

### Input

The first line contains an integer $n$ ($1 \le n \le 100$).

The second line contains $n$ integers $a_1, a_2, \cdots, a_n$ ($-100 \le a_i \le 100$).

### Output

Print the minimum possible sum of $a_i$ after performing the operation at most once.

### Sample Input

```
3
1 2 3
```

### Sample Output

```
6
```

### Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    print(sum(a) - max(a) - min(a))

if __name__ == '__main__':
    main()
```

## 03650 - 2018 ACM-ICPC Asia Daejeon Regional Contest

### Problem

You are given a sequence of integers $a_1, a_2, \cdots, a_n$.

You can perform the following operation at most once:

- Choose an integer $x$ and replace all $a_i$ with $a_i + x$.

Find the maximum possible sum of $a_i$ after performing the operation at most once.

### Input

The first line contains an integer $n$ ($1 \le n \le 100$).

The second line contains $n$ integers $a_1, a_2, \cdots, a_n$ ($-100 \le a_i \le 100$).

### Output

Print the maximum possible sum of $a_i$ after performing the operation at most once.

### Sample Input

```
3
1 2 3
```

### Sample Output

```
9
```

### Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    print(sum(a) + max(a) - min(a))

if __name__ == '__main__':
    main()
```

## 03651 - 2018 ACM-ICPC Asia Daejeon Regional Contest

### Problem

You are given a sequence of integers $a_1, a_2, \cdots, a_n$.

You can perform the following operation at most once:

- Choose an integer $x$ and replace all $a_i$ with $a_i + x$.

Find the minimum possible product of $a_i$ after performing the operation at most once.

### Input

The first line contains an integer $n$ ($1 \le n \le 100$).

The second line contains $n$ integers $a_1, a_2, \cdots, a_n$ ($-100 \le a_i \le 100$).

### Output

Print the minimum possible product of $a_i$ after performing the operation at most once.

### Sample Input

```
3
1 2 3
```

### Sample Output

```
6
```

### Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    print(min(a) * sum(a))

if __name__ == '__main__':
    main()
```

## 03652 - 2018 ACM-ICPC Asia Daejeon Regional Contest

### Problem

You are given a sequence of integers $a_1, a_2, \cdots, a_n$.

You can perform the following operation at most once:

- Choose an integer $x$ and replace all $a_i$ with $a_i + x$.

Find the maximum possible product of $a_i$ after performing the operation at most once.

### Input

The first line contains an integer $n$ ($1 \le n \le 100$).

The second line contains $n$ integers $a_1, a_2, \cdots, a_n$ ($-100 \le a_i \le 100$).

### Output

Print the maximum possible product of $a_i$ after performing the operation at most once.

### Sample Input

```
3
1 2 3
```

### Sample Output

```
18
```

### Solution

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    print(max(a) * sum(a))

if __name__ == '__main__':
    main()
```

## 03653 - 2018 ACM-
