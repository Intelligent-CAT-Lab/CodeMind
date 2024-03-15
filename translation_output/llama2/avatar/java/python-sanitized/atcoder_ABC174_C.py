import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)