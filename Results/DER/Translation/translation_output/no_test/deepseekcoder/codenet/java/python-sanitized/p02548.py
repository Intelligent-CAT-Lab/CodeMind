import sys

def count_pairs(n):
    cnt = 0
    for i in range(1, n+1):
        for j in range(1, n+1):
            if i * j < n:
                cnt += 1
            else:
                break
    return cnt

n = int(sys.stdin.readline().strip())
print(count_pairs(n))