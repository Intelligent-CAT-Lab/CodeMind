```python
import sys

_intMax = sys.maxsize  # =2147483647>10^9
_intMin = -sys.maxsize - 1
_longMax = sys.maxsize  # =9223372036854775807L>10^18
_longMin = -sys.maxsize - 1

def solve():
    set_ = set()
    for ch in range(ord('a'), ord('z') + 1):
        set_.add(chr(ch))
    line = read_line()
    for i in range(len(line)):
        ch = line[i]
        set_.remove(ch)
    if len(set_) > 0:
        sb = line + chr(min(set_))
        print(sb)
        return
    if line == "zyxwvutsrqponmlkjihgfedcba":
        print(-1)
        return
    next_(line, "")

def next_(line, cur):
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
        if ch not in cur:
            if next_(line, cur + chr(ch)):
                return True
    return False

def abs(a):
    return a if a >= 0 else -a

def max(a, b):
    return a if a > b else b

def min(a, b):
    return a if a < b else b

def pint(s):
    return int(s)

def plong(s):
    return int(s)

def read_line():
    return sys.stdin.readline().strip()

def read_num():
    return pint(read_line())

def read_long():
    return plong(read_line())

def
