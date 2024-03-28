import math

def pow(base, n):
    retVal = 1
    while n > 0:
        if n & 1 == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal

def solve():
    x = int(input())
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

    for powVal in powMap:
        diff = abs(x - powVal)
        if diff in powMap:
            print(powMap[powVal], end='')
            if powVal - x < 0:
                print(" -" + str(powMap[diff]), end='')
            else:
                print(" " + str(powMap[diff]), end='')
            print()
            return

solve()