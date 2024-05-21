import sys

def main():
    n, m, a, b, p, q = map(int, input().split())
    if a == 1 and b == 1:
        ans = min(abs(n * p - m), abs(n * q - m))
    else:
        lim = 0
        while p * a**lim + q * b**lim <= m:
            lim += 1
        lim += 1
        lim = min(lim, n)
        lim = min(lim, 40)
        pending1 = []
        pending2 = []
        powA = [1] * 42
        powB = [1] * 42
        for i in range(1, 42):
            powA[i] = powA[i - 1] * a
            powB[i] = powB[i - 1] * b
        for t in range(2):
            maxi = (t == 0) * lim // 2 + (t == 1) * (lim + 1) // 2
            for i in range(1 << maxi):
                s = 0
                for j in range(maxi):
                    if (i >> j) & 1:
                        s += p * powA[j + (t == 1) * lim // 2] + q * powB[j + (t == 1) * lim // 2]
                        if s > 10**18:
                            break
                if s <= 10**18:
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

if __name__ == '__main__':
    main()