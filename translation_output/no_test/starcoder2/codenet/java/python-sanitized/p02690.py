import sys

def pow(base, n):
    retVal = 1
    while n > 0:
        if n & 1 == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal

def solve():
    x = int(sys.stdin.readline())
    powMap = {}
    powMap[0] = 0
    powMap[1] = 1
    beforePow = 1
    base = 2
    while True:
        powVal = pow(base, 5)
        powMap[powVal] = base
        if powVal - beforePow > x:
            break
        base += 1
        beforePow = powVal

    for powVal, base in powMap.items():
        diff = abs(x - powVal)
        if diff in powMap:
            print(base, end=' ')
            if powVal - x < 0:
                print('-'+str(powMap[diff]))
            else:
                print(powMap[diff])
            return

solve()