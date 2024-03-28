```python
import math

def main():
    n, m, a, b, p, q = map(int, input().split())
    INF = 100000000000000
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
    while p * math.pow(a, lim) + q * math.pow(b, lim) <= m:
        lim += 1
    lim += 1
    lim = min(lim, n)
    lim = min(lim, 40)
    pending1 = []
    pending2 = []
    powA = [a**i for i in range(42)]
    powB = [b**i for i in range(42)]

    for t in range(2):
        max_val = lim // 2 if t == 0 else (lim + 1) // 2
        for i in range(1 << max_val):
            s = 0
            for j in range(max_val):
                if (i & (1 << j)) > 0:
                    s += p * powA[j + (lim // 2 if t == 1 else 0)] + q * powB[j + (lim // 2 if t == 1 else 0)]
                    if s > INF:
                        break
            if t == 0:
                pending1.append(s)
            else:
                pending2.append(s)

    pending1.sort()
    pending2.sort()

    ans = m
    for j in range(2):
        t = len(pending2) - 1
        for i in range(len(pending1)):
            if j == 0:
                while t > 0 and pending1[i] + pending2[t] > m:
                    t -= 1
            elif j == 1:
                while t > 0 and pending1[i] + pending2[t] >= m and pending1[i] + pending2[t - 1] >= m:
                    t -= 1
            ans = min(ans, abs(-m + pending1[i] + pending2[t]))
    
    print(ans)

if __name__ == "__main__":
    main()
```

