import sys

n = int(sys.stdin.readline())

if n > 0:
    count = 0
    while n >= 2:
        n //= 2
        count += 1
    count += 1
    print(count)