import math

def find_power(n, p):
    if p == 1:
        return 1
    for i in range(2, int(math.pow(p, 1/n))+1):
        if p % i == 0:
            return i
    return -1

n, p = map(int, input().split())
if n == 1:
    print(p)
else:
    res = find_power(n, p)
    if res == -1:
        print("No power found")
    else:
        print(res)