import sys

k = int(sys.stdin.readline())
s = int(sys.stdin.readline())

count = 0
for x in range(0, k+1):
    for y in range(0, k+1):
        z = s - x - y
        if z >= 0 and z <= k:
            count += 1

print(count)