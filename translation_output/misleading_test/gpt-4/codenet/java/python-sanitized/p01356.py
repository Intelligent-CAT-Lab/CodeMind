import bisect

def main():
    inputs = list(map(int, input().split()))
    n, m, a, b, p, q = inputs
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
    while p * a ** lim + q * b ** lim <= m:
        lim += 1
    lim += 1
    lim = min(lim, n, 40)
    pending1 = []
    pending2 = []
    powA = [1] * 42
    powB = [1] * 42
    for i in range(1, len(powA)):
        powA[i] = powA[i - 1] * a
        powB[i] = powB[i - 1] * b
    for t in range(2):
        max_size = (lim // 2) if t == 0 else (lim + 1) // 2
        for i in range(1 << max_size):
            s = 0
            for j in range(max_size):
                if (i & (1 << j)):
                    s += p * powA[j + (lim // 2 if t == 1 else 0)] + q * powB[j + (lim // 2 if t == 1 else 0)]
                    if s > INF:
                        break
            else:  # Continue loop, only executed if inner loop wasn't 'break'ed.
                if t == 0:
                    pending