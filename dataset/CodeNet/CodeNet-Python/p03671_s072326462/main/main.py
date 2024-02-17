import sys
input = sys.stdin.readline

a=list(map(int,input().split()))
a.sort()
print((a[0]+a[1]))
