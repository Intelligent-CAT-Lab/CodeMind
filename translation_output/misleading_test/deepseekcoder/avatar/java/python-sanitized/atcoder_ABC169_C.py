import sys

def solve(a, b):
    c = round(b * 100)
    d = a * c
    return d // 100

a = int(sys.stdin.readline().split()[0])
b = float(sys.stdin.readline().split()[1])
print(solve(a, b))