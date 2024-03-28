import sys

def input():
    global br
    global sc
    br = sys.stdin.readline().strip()
    sc = sys.stdin

def next_int():
    return int(input())

def next_long():
    return long(input())

def next():
    return input().strip()

def println(o):
    sys.stdout.write(o)
    sys.stdout.write(br)
    sys.stdout.flush()

def print(o):
    sys.stdout.write(o)
    sys.stdout.flush()

A = next_long()
B = next_long()
C = next_long()

max = B + C

if C >= B:
    C -= B
    B = 0
else:
    B -= C
    C = 0

if C >= A:
    C -= A

print(C > 0 and max - C + 1 or max)