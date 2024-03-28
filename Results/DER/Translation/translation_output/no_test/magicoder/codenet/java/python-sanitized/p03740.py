import sys

try:
    a, b = map(int, sys.stdin.readline().split())
    print("Brown" if abs(a - b) <= 1 else "Alice")
except Exception as e:
    print(e)