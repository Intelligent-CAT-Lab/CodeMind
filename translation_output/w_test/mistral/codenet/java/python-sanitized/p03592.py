import sys

def is_valid(n, m, k):
    for i in range(n+1):
        for j in range(m+1):
            if (i*j*2 == n*m + k):
                return True
    return False

n, m, k = map(int, sys.stdin.readline().strip().split())

if is_valid(n, m, k):
    print("Yes")
else:
    print("No")