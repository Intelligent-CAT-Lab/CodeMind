def pow(a, n):
    ret = 1
    while n > 0:
        if n % 2 == 1:
            ret *= a
        a *= a
        n >>= 1
    return ret

def main():
    n = int(input())
    m = int(input())
    a = int(input())
    b = int(input())
    p = int(input())
    q = int(input())
    INF = 1000_000_000_000_000

    if a == 1 and b == 1:
        ans = INF
        div = m // (p + q)
        div = min(div, n)
        ans = min(ans, abs(div * (p + q) - m))
        div = min(div + 1, n)
        ans = min(ans, abs(div * (p + q) - m))
        print(ans)
        return

    lim = 0
    while p * pow(a, lim) + q * pow(b, lim) <= m:
        lim += 1
    lim += 1
    lim = min(lim, n)
    lim = min(lim, 40)

    pending1 = []
    pending2 = []
    powA = [0] * 42
    powB = [0] * 42
    powA[0] = 1
    powB[0] = 1
    for i in range(1, len(powA)):
        powA[i] = powA[i - 1] * a
        powB[i] = powB[i - 1] * b

    for t in range(2):
        max_idx = lim // 2 if t == 0 else (lim + 1) // 2
        for i in range(1 << max_idx):
            s = 0
            for j in range(max_idx):
                if (i & (1 << j)) > 0:
                    s += p * powA[j + (lim // 2 if t == 1 else 0)] + \
                         q * powB[j + (lim // 2 if t == 1 else 0)]
                    if s > INF:
                        break
            else:
                if t == 0:
                    pending