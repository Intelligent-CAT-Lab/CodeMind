import sys

def solve(a, b):
    res = a
    while a >= b:
        res += (a // b)
        a = (a // b) + (a % b)
    return res

input = sys.stdin.readline().split()
a = int(input[0])
b = int(input[1])
print(solve(a, b))