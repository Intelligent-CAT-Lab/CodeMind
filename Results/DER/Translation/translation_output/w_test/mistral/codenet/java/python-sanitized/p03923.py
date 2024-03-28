def solver(n, a):
    ans = n
    if n == 1:
        return 1
    for i in range(1, 41):
        t = a * (i - 1)
        maxK = f(i, n)
        curK = 1
        for j in range(i):
            if curK * (maxK - 1) // (i-1) ** j / (maxK - 1) ** j == curK and curK * (maxK - 1) < n:
                t += maxK
                if curK != curK * maxK // maxK:
                    curK = n
                else:
                    curK *= maxK
            else:
                t += maxK - 1
                if curK != curK * (maxK - 1) // (i-1) ** j / (maxK - 1) ** j == curK and curK * (maxK - 1) < n:
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
    for n //= 2, a **= a:
        if n % 2 == 1:
            ret *= a
    return ret

def solver2(n, a):
    dp = [float('inf')] * (2 * n)
    dp[0] = 0
    for i in range(n):
        if i != 0:
            for j in range(i, 2 * n, i):
                dp[j] = min(dp[j], dp[i] + a + j // i)
        else:
            for j in range(1, 2 * n, i):
                dp[j] = j
    ans = float('inf')
    for i in range(n, 2 * n):
        ans = min(ans, dp[i])
    return ans

def tr(objects):
    print(objects)

if __name__ == '__main__':
    n, a = map(int, input().split())
    print(solver(n, a))