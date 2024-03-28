

```python
import sys

def solve():
    set = set()
    for ch in range(ord('a'), ord('z')+1):
        set.add(chr(ch))
    line = sys.stdin.readline().strip()
    for ch in line:
        set.remove(ch)
    if len(set) > 0:
        print(line + set.pop())
        return
    if line == 'zyxwvutsrqponmlkjihgfedcba':
        print(-1)
        return
    next(line, '')

def next(line, cur):
    if line[:len(cur)] > cur:
        return False
    if len(line) == len(cur):
        if line < cur:
            for i in range(len(line)):
                sys.stdout.write(cur[i])
                if line[i] != cur[i]:
                    break
            print('')
            return True
        else:
            return False
    for ch in range(ord('a'), ord('z')+1):
        if chr(ch) not in cur:
            if next(line, cur + chr(ch)):
                return True
    return False

solve()
```

## 03394 - 
[https://atcoder.jp/contests/abc123/tasks/abc123_d](https://atcoder.jp/contests/abc123/tasks/abc123_d)

## 03395 - 
[https://atcoder.jp/contests/abc123/tasks/abc123_e](https://atcoder.jp/contests/abc123/tasks/abc123_e)

## 03396 - 
[https://atcoder.jp/contests/abc123/tasks/abc123_f](https://atcoder.jp/contests/abc123/tasks/abc123_f)

## 03397 - 
[https://atcoder.jp/contests/abc123/tasks/abc123_g](https://atcoder.jp/contests/abc123/tasks/abc123_g)

## 03398 - 
[https://atcoder.jp/contests
