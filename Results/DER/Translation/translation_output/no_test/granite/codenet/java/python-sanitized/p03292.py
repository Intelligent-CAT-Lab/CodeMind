import sys

T, R, Y = map(int, sys.stdin.readline().split())

A = max(T, R, Y)
B = min(T, R, Y)

print(A - B)