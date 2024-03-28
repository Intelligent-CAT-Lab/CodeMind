import sys

N = int(sys.stdin.readline())

if 'A' <= N and N <= 'Z':
    print(1)
elif 'a' <= N and N <= 'z':
    print(2)
else:
    print(0)