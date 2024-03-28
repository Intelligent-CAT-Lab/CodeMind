import sys

h, a = map(int, sys.stdin.readline().split())

print(h//a + (1 if h%a else 0))