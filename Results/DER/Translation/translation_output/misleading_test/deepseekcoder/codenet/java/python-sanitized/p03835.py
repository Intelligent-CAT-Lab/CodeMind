import sys

def count_ways(k, s):
    count = 0
    for x in range(k+1):
        for y in range(k+1):
            z = s - x - y
            if 0 <= z <= k:
                count += 1
    return count

k, s = map(int, sys.stdin.readline().split())
print(count_ways(k, s))