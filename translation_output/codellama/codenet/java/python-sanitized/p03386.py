import sys

a, b, k = map(int, sys.stdin.readline().split())

set = set()
cnt = 0
for i in range(a, b+1):
    if cnt >= k:
        break
    cnt += 1
    set.add(i)

cnt = 0
for i in range(b, a-1, -1):
    if cnt >= k:
        break
    cnt += 1
    set.add(i)

for ans in set:
    print(ans)