import sys

def solver(n, a):
    ans = n
    if n == 1:
        return 1
    for i in range(1, 41):
        t = a * (i - 1)
        maxK = f(i, n)
        curK = 1
        for j in range(i):
            if curK * (maxK - 1) / (maxK - 1) == curK and curK * (maxK - 1) < n:
                t += maxK
                if curK != curK * maxK / maxK:
                    curK = n
            else:
                t += maxK - 1
                if curK != curK * (maxK - 1) / (maxK - 1):
                    curK = n
                else:
                    curK *= maxK - 1
        ans = min(ans, t)
    return ans

def f(i, n):
    ok = n
    ng = 0
    while ok - ng > 1:
        middle = (ok + ng) // 2
        v = 1
        for k in range(i):
            if v != v * middle // middle:
                ok = middle
                continue
            v *= middle
        if v >= n:
            ok = middle
        else:
            ng = middle
    return ok

def pow(a, n):
    ret = 1
    for n > 0:
        n >>= 1
        a *= a
        if n % 2 == 1:
            ret *= a
    return ret

if __name__ == '__main__':
    n = int(input())
    a = int(input())
    print(solver(n, a))