import sys

a,b,c,k = map(int,sys.stdin.readline().split())

if abs(a-b) > 10**18:
    print("Unfair")
elif k%2 == 0:
    print(a-b)
else:
    print(-1*(a-b))