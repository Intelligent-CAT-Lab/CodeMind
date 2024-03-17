import sys

N = int(sys.stdin.readline())
A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
print(min(A, B), max(0, A + B - N))