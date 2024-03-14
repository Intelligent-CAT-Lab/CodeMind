import io
import sys
import time
import re

is_ = sys.stdin
out = sys.stdout

def solve():
    s = ns()
    l = len(s)

    if l % 2 == 0 ^ s[0] == s[-1]:
        out.write("Second\n")
    else:
        out.write("First\n")

def main():
    S = time.time()
    global is_
    if INPUT:
        is_ = io.StringIO(INPUT)
    solve()
    out.flush()
    G = time.time()
    tr(f"{G-S}ms")

def eof():
    if lenbuf == -1: return True
    lptr = ptrbuf
    while lptr < lenbuf:
        if not isSpaceChar(inbuf[lptr]): return False
        lptr += 1

    try:
        is_.seek(0)
        while True:
            b = is_.read(1)
            if not b: return True
            if not isSpaceChar(b):
                is_.seek(is_.tell() - 1)
                return False
    except Exception:
        return True

inbuf = bytearray(1024)
lenbuf = 0
ptrbuf = 0

def readByte():
    global lenbuf, ptrbuf
    if lenbuf == -1: raise EOFError()
    if ptrbuf >= lenbuf:
        ptrbuf = 0
        try: lenbuf = is_.readinto(inbuf)
        except Exception: raise EOFError()
        if lenbuf <= 0: return -1
    return inbuf[ptrbuf]

def isSpaceChar(c): return not (c >= 33 and c <= 126)

def skip():
    b = readByte()
    while b != -1 and isSpaceChar(b): b = readByte()
    return b

def nd(): return float(ns())
def nc(): return chr(skip())

def ns():
    b = skip()
    s = []
    while not isSpaceChar(b):
        s.append(chr(b))
        b = readByte()
    return "".join(s)

def na(n):
    a = [0]*n
    for i in range(n): a[i] = ni()
    return a

def ni():
    num = 0
    b = readByte()
    minus = False
    while not ((b >= '0' and b <= '9') or b == '-' or b == ''): b = readByte()
    if b == '-':
        minus = True
        b = readByte()
    while True:
        if b >= '0' and b <= '9':
            num = num * 10 + (ord(