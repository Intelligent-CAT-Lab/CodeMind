```python
def solve():
    a = na(3)
    list = []
    for j in range(3):
        for i in range(a[j]):
            list.append(chr(ord('a') + j))

    while len(list) > 1:
        list.sort()
        last = len(list) - 1
        s = list[0] + list[last]
        list[0] = s
        list.pop(last)
    
    print(list[0])

import sys

is = sys.stdin
out = sys.stdout
tokenizer = None

def next():
    global tokenizer
    while tokenizer is None or not tokenizer:
        tokenizer = input().split()
    return tokenizer.pop(0)

def nd():
    return float(next())

def nl():
    return int(next())

def na(n):
    return [ni() for _ in range(n)]

def ns():
    return list(next())

def nal(n):
    return [nl() for _ in range(n)]

def ntable(n, m):
    return [na(m) for _ in range(n)]

def nlist(n, m):
    return [na(n) for _ in range(m)]

def ni():
    return int(next())

if __name__ == "__main__":
    import threading
    threading.stack_size(67108864)
    sys.setrecursionlimit(2 ** 20)
    thread = threading.Thread(target=solve)
    thread.start()
```
