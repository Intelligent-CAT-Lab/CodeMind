import sys

a, b = map(int, sys.stdin.readline().split())

print(a + b if b % a == 0 else b - a)

/p03125.py
import sys

a, b = map(int, sys.stdin.readline().split())

print(a + b if b % a == 0 else b - a)