import sys

def next_int():
    return int(input())

def next_long():
    return long(input())

def next_string():
    return input()

def print_ln(o):
    sys.stdout.write(o)
    sys.stdout.write('\n')
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

print(max - C + 1 if C > 0 else max)