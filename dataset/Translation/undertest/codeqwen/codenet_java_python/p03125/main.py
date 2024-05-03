import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

print(b % a == 0 and a + b or b - a)