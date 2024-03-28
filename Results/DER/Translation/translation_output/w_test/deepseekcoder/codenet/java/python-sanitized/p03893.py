import sys

def calculate(x):
    next = 2
    for i in range(x):
        next = (next + 1) * 2
    return next

x = int(sys.stdin.readline().strip())
print(calculate(x))