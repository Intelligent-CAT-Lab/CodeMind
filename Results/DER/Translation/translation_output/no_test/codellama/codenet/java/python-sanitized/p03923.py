import math

def solver(n, a):
    ans = n
    for i in range(1, 41):
        t = a * (i - 1)
        max_k = f(i, n)
        cur_k = 1
        for j in range(i):
            if cur_k * math.pow(max_k - 1, i - j) / math.pow(max_k - 1, i - j) == cur_k and cur_k * math.pow(max_k - 1, i - j) < n:
                t += max_k
                if cur_k != cur_k * max_k / max_k:
                    cur_k = n
                else:
                    cur_k *= max_k
            else:
                t += max_k - 1
                if cur_k != cur_k * (max_k - 1) / (max_k - 1):
                    cur_k = n
                else:
                    cur_k *= max_k - 1
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
    while n > 0:
        if n % 2 == 1:
            ret *= a
        n >>= 1
        a *= a
    return ret

def solver2(n, a):
    dp = [float('inf')] * (2 * n)
    dp[0] = 0
    for i in range(n):
        if i != 0:
            for j in range(i, 2 * n, i):
                dp[j] = min(dp[j], dp[i] + a + j // i)
        else:
            for j in range(1, 2 * n):
                dp[j] = j
    ans = float('inf')
    for i in range(n, 2 * n):
        ans = min(ans, dp[i])
    return ans

def tr(*objects):
    print(objects)

if __name__ == '__main__':
    n = int(input())
    a = int(input())
    print(solver(n, a))