import sys

a,b,c = map(int,sys.stdin.readline().split())

if a <= c and c <= b:
    print("Yes")
else:
    print("No")