import sys

a,b,c = map(int,sys.stdin.readline().split())
i = 0
cnt = 0
while cnt < c:
    i += 1
    cnt += a
    if i % 7 == 0:
        cnt += b
print(i)