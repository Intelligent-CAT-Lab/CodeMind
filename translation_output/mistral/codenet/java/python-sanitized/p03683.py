import sys

def factorialsModBillion(n, m):
    result = 1
    for i in range(1, n+1):
        result = (result * i) % 1000000007
    for i in range(1, m+1):
        result = (result * i) % 1000000007
    return result

n, m = map(int, sys.stdin.readline().split())
if abs(n-m) > 1:
    print(0)
elif abs(n-m) == 1:
    print(factorialsModBillion(n, m))
else:
    print((factorialsModBillion(n, m) * 2) % 1000000007)