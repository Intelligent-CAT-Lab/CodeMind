import sys

input = sys.stdin.readline
MOD = 1000000007

N,A,B = map(int,input().split())

if abs(A-B)%2 == 0:
    print(abs(A-B)//2)
else:
    if (A-1) < (N-B):
        print((A-1)+1+(B-A-1)//2)
    else:
        print((N-B)+1+(B-A-1)//2)