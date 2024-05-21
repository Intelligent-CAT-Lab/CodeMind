import sys

def main():
    n, m, a, b, p, q = map(int, input().split())
    if a == 1 and b == 1:
        ans = min(abs(n * p - m), abs((n - 1) * p - m))
    else:
        k = 0
        while p * pow(a, k) + q * pow(b, k) <= m:
            k += 1
        k = min(k, n)
        k = min(k, 40)
        pending1 = []
        pending2 = []
        powA = [1] * 42
        powB = [1] * 42
        for i in range(1, 42):
            powA[i] = powA[i - 1] * a
            powB[i] = powB[i - 1] * b
        for t in range(2):
            max_ = k // 2 if t == 0 else (k + 1) // 2
            for i in range(1 << max_):
                s = 0
                for j in range(max_):
                    if (i >> j) & 1:
                        s += p * powA[j + (k // 2 if t == 1 else 0)] + q * powB[j + (k // 2 if t == 1 else 0)]
                        if s > 10 ** 18:
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
                else:
                    while t > 0 and pending1[i] + pending2[t] >= m and pending1[i] + pending2[t - 1] >= m:
                        t -= 1
                ans = min(ans, abs(-m + pending1[i] + pending2[t]))
    print(ans)

def pow(a, n):
    ret = 1
    while n > 0:
        if n % 2 == 1:
            ret *= a
        a *= a
        n //= 2
    return ret

input = lambda: sys.stdin.readline().rstrip()
main()