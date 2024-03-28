import sys

# input
k, s = map(int, sys.stdin.readline().split())

# search
count = 0
for x in range(k+1):
    for y in range(k+1):
        z = s - x - y
        if 0 <= z <= k:
            count += 1

# answer
print(count)