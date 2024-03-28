import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b /= 10
    return a + reverseB

print(getNum(a, b))