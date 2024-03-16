
```python
import sys

nums = [[0 for i in range(3)] for j in range(4)]
used = [False for i in range(10)]

layout = [[0, 2],
          [1, 1], [1, 2],
          [2, 0], [2, 1], [2, 2],
          [3, 0], [3, 1], [3, 2]]

def solve(c):
    if c == 0:
        if check():
            return 1
        else:
            return 0

    ret = 0
    for i in range(4):
        for j in range(3):
            if nums[i][j] == -1:
                for k in range(1, 10):
                    if not used[k]:
                        nums[i][j] = k
                        used[k] = True
                        ret += solve(c - 1)
                        nums[i][j] = -1
                        used[k] = False
                return ret

def check():
    a = [0 for i in range(4)]
    for i in range(4):
        a[i] = nums[i][0] * 100 + nums[i][1] * 10 + nums[i][2]
    return a[0] + a[1] + a[2] == a[3]

if __name__ == '__main__':
    for line in sys.stdin:
        words = line.split()
        for i in range(9):
            n = int(words[i])
            if n != -1:
                used[n] = True
            else:
                nums[layout[i][0]][layout[i][1]] = n
        print(solve(9))
```

## 00323 - 1, 2, 3, 4

### Problem

> 1, 2, 3, 4

### Solution

```python
import sys

def solve(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 4
    return solve(n - 1) + solve(n - 2) + solve(n - 3)

if __name__ == '__main__':
    for line in sys.stdin:
        print(solve(int(line)))
```

## 00324 - 1, 2, 3, 4, 5

### Problem

> 1, 2, 3, 4, 5

### Solution

```python
import sys

def solve(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 4
    if n == 4:
        return 7
    return solve(n - 1) + solve(n - 2) + solve(n - 3) + solve(n - 4)

if __name__ == '__main__':
    for line in sys.stdin:
        print(solve(int(line)))
```

## 00325 - 1, 2, 3, 4, 5, 6

### Problem

> 1, 2, 3, 4, 5, 6

### Solution

```python
import sys

def solve(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 4
    if n == 4:
        return 7
    if n == 5:
        return 13
    return solve(n - 1) + solve(n - 2) + solve(n - 3) + solve(n - 4) + solve(n - 5)

if __name__ == '__main__':
    for line in sys.stdin:
        print(solve(int(line)))
```

## 00326 - 1, 2, 3, 4, 5, 6, 7

### Problem

> 1, 2, 3, 4, 5, 6, 7

### Solution

```python
import sys

def solve(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 4
    if n == 4:
        return 7
    if n == 5:
        return 13
    if n == 6:
        return 24
    return solve(n - 1) + solve(n - 2) + solve(n - 3) + solve(n - 4) + solve(n - 5) + solve(n - 6)

if __name__ == '__main__':
    for line in sys.stdin:
        print(solve(int(line)))
```

## 00327 - 1, 2, 3, 4, 5, 6, 7, 8

### Problem

> 1, 2, 3, 4, 5, 6, 7, 8

### Solution

```python
import sys

def solve(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 4
    if n == 4:
        return 7
    if n == 5:
        return 13
    if n == 6:
        return 24
    if n == 7:
        return 44
    return solve(n - 1) + solve(n - 2) + solve(n - 3) + solve(n - 4) + solve(n - 5) + solve(n - 6) + solve(n - 7)

if __name__ == '__main__':
    for line in sys.stdin:
        print(solve(int(line)))
```

## 00328 - 1, 2, 3, 4,
