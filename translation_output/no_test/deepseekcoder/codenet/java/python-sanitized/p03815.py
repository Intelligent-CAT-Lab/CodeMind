import io
import sys
import time
import re
import collections

sys.stdin = io.StringIO("""
""")

def tr(*o):
    if len(INPUT) != 0:
        print(o)

def isSpaceChar(c):
    return c >= 33 and c <= 126

def readByte():
    global lenbuf, ptrbuf, inbuf
    if lenbuf == -1:
        raise ValueError()
    if ptrbuf >= lenbuf:
        ptrbuf = 0
        lenbuf = sys.stdin.read(inbuf)
        if lenbuf <= 0:
            return -1
    return inbuf[ptrbuf]

def skip():
    b = readByte()
    while b != -1 and isSpaceChar(b):
        b = readByte()
    return b

def ns():
    b = skip()
    if b == -1:
        return ""
    sb = []
    while True