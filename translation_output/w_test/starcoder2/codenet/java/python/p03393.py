

```python
import sys

def solve():
    line = input()
    set = set()
    for ch in line:
        set.add(ch)
    if len(set) > 0:
        print(line + set.pop())
        return
    if line == "zyxwvutsrqponmlkjihgfedcba":
        print(-1)
        return
    next(line, "")

def next(line, cur):
    if line[:len(cur)] > cur:
        return False
    if len(line) == len(cur):
        if line < cur:
            for i in range(len(line)):
                print(cur[i], end="")
                if line[i] != cur[i]:
                    break
            print()
            return True
        else:
            return False
    for ch in range(ord('a'), ord('z') + 1):
        if chr(ch) not in cur:
            if next(line, cur + chr(ch)):
                return True
    return False

solve()
```

## 03394 - 
[https://atcoder.jp/contests/abc123/tasks/abc123_d](https://atcoder.jp/contests/abc123/tasks/abc123_d)

### 問題文

### 制約

### 解法

### 実装

```python
```

## 03395 - 
[https://atcoder.jp/contests/abc123/tasks/abc123_e](https://atcoder.jp/contests/abc123/tasks/abc123_e)

### 問題文

### 制約

### 解法

### 実装

```python
```

## 03396 - 
[https://atcoder.jp/contests/abc123/tasks/abc123_f](https://atcoder.jp/contests/abc123/tasks/abc123_f)

### 問題文

### 制約

### 解法

### 実装

```python
```

## 03397 - 
[https://atcoder.jp/contests/abc123/tasks
