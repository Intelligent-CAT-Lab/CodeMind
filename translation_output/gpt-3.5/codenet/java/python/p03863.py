```python
import io
import sys

_INPUT = """ 
"""

def solve():
    s = ns()
    l = len(s)
    
    if l % 2 == 0 != (s[0] == s[l - 1]):
        print("Second")
    else:
        print("First")

def main():
    S = 0
    is_input = False
    if not is_input:
        global _INPUT
        _INPUT = io.BytesIO(_INPUT.encode())
    out = sys.stdout

    solve()
    out.flush()

if __name__ == "__main__":
    main()

def isSpaceChar(c):
    return not (33 <= c <= 126)

def skip():
    b = readByte()
    while b != -1 and isSpaceChar(b):
        b = readByte()
    return b

def nd():
    return float(ns())

def nc():
    return chr(skip())

def ns():
    b = skip()
    sb = bytearray()
    while not isSpaceChar(b):
        sb.append(b)
        b = readByte()
    return sb.decode()

def ns_chars(n):
    buf = bytearray(n)
    b = skip()
    p = 0
    while p < n and not isSpaceChar(b):
        buf[p] = b
        p += 1
        b = readByte()
    return buf if n == p else buf[:p]

def nm_chars(n, m):
    map = []
    for i in range(n):
        map.append(ns_chars(m))
    return map

def na(n):
    return [ni() for _ in range(n)]

def ni():
    num = 0
    minus = False
    b = 0

    while b != -1 and not (b >= 48 and b <= 57) and b != 45:
        b = readByte()
    
    if b == 45:
        minus = True
        b = readByte()

    while True:
        if 48 <= b <= 57:
            num = num * 10 + (b - 48)
        else:
            return -num if minus else num
        b = readByte()

def nl():
    num = 0
    minus = False
    b = 0

    while b != -1 and not (b >= 48 and b <= 57) and b != 45:
        b = readByte()
    
    if b == 45:
        minus = True
        b = readByte()

    while True:
        if 48 <= b <= 57:
            num = num * 10 + (b - 48)
        else:
            return -num if minus else num
        b = readByte()

def readByte():
    global ptrbuf
    if lenbuf == -1:
        raise ValueError("End of file")
    if ptrbuf >= lenbuf:
        ptrbuf = 0
        try:
            lenbuf = _INPUT.readinto(inbuf)
        except EOFError:
            raise ValueError("End of file")
        if lenbuf <= 0:
            return -1
    return inbuf[ptrbuf]

ptrbuf = 0
lenbuf = 0
inbuf = io.BytesIO().getbuffer()

def tr(*o):
    global _INPUT
    if _INPUT:
        print(*o)

```
