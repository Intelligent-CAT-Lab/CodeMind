import sys

def next_int():
    return int(next())

def next_long():
    return long(next())

def next():
    return sys.stdin.readline().rstrip()

def println(o):
    sys.stdout.write(str(o) + "\n")

def print(o):
    sys.stdout.write(str(o))

A = next_long()
B = next_long()
C = next_long()

max_val = B + C

if C >= B:
    C -= B
    B = 0
else:
    B -= C
    C = 0

if C >= A:
    C -= A
else:
    C = 0

println(C > 0 and max_val - C + 1 or max_val)