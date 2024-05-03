```python
import math

def solve():
    n = ni()
    K = nl() - 1
    sins = [math.sin(2 * math.pi * i / n) / 2 for i in range(n + 1)]

    low, high = 0, 2 * math.pi
    for _ in range(50):
        h = (low + high) / 2
        if count(h, n) <= K:
            low = h
        else:
            high = h

    print("%.14f" % high)


def count(h, n):
    ret = 0
    for len in range(1, n - 1):
        low, high = 0, (n - len) // 2 + 1
        while high - low > 1:
            q = (high + low) // 2
            if S(len, q, n - len - q) <= h:
                low = q
            else:
                high = q
        ret += low * 2
        if low == (n - len) // 2 and (n - len) % 2 == 0:
            ret -= 1
    assert ret * n % 3 == 0
    return ret * n // 3


def S(a, b, c):
    return sins[a] + sins[b] + sins[c]


def eof():
    global lenbuf, ptrbuf
    if lenbuf == -1:
        return True
    lptr = ptrbuf
    while lptr < lenbuf:
        if not isSpaceChar(inbuf[lptr]):
            return False
        lptr += 1
    try:
        inbuf = inbuf[ptrbuf:]
        lenbuf -= ptrbuf
        ptrbuf = 0
        inbuf += is.read(1024)
        lenbuf += len(inbuf)
    except EOFError:
        return True
    return False


def isSpaceChar(c):
    return not (c >= 33 and c <= 126)


def skip():
    b = skip()
    while b != -1 and isSpaceChar(b):
        
