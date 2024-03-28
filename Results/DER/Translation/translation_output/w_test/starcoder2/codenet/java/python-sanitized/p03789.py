import math

def solve(N):
    n = len(N)
    bigint = int(N)
    bigint *= 9

    ok = n * 10
    ng = 0
    while math.fabs(ok - ng) > 1:
        med = (ok + ng) // 2
        if canMake(med, bigint):
            ok = med
        else:
            ng = med
    return (ok + 8) // 9

def canMake(n, bigint):
    bigint += n
    return digitSum(bigint) <= n

def digitSum(n):
    sum = 0
    while n >= 1:
        sum += n % 10
        n //= 10
    return sum

N = input()
print(solve(N))