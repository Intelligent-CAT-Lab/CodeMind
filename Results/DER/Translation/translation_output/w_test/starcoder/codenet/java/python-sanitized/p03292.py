import sys

T = int(sys.stdin.readline())
R = int(sys.stdin.readline())
Y = int(sys.stdin.readline())

A = max(max(T,R),Y)
B = min(min(T,R),Y)

print(A-B)