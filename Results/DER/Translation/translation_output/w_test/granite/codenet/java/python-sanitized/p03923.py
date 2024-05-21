import math

def solver(n, a):
    ans = n
    if n == 1:
        return 1
    for i in range(1, 41):
        # min ( k1 + k2 +... ki + a*(i-1) )
        # k1*k2*k3*...*ki>=n
        t = a * (i - 1)
        max_k = f(i, n)
        cur_k = 1
        for j in range(i):
            if cur_k * pow(max_k - 1, i - j) / pow(max_k - 1, i - j) == cur_k and cur_k * pow(max_k - 1, i - j) < n:
                t += max_k
                if cur_k!= cur_k * max_k / max_k:
                    cur_k = n
                else:
                    cur_k *= max_k
            else:
                t += max_k - 1
                if cur_k!= cur_k * (max_k - 1) / (max_k - 1):
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
            if v!= v * middle // middle:
                ok = middle
                break
            v *= middle
        else:
            if v >= n:
                ok = middle
            else:
                ng = middle
    return ok

def pow(a, n):
    ret = 1
    for _ in range(n):
        if n % 2 == 1:
            ret *= a
        a *= a
        n //= 2
    return ret

n, a = map(int, input().split())
print(solver(n, a))