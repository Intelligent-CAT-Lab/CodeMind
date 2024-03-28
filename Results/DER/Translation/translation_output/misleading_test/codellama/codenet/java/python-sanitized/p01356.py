import math

def main(n, m, a, b, p, q):
    # Check if a and b are equal to 1
    if a == 1 and b == 1:
        # Calculate the minimum difference between (p+q)N and m
        ans = 10000000000000000
        div = m // (p + q)
        div = min(div, n)
        ans = min(ans, abs(div * (p + q) - m))
        div = min(div + 1, n)
        ans = min(ans, abs(div * (p + q) - m))
        return ans

    # Calculate the maximum value of k such that pa^k+qb^k <= m
    lim = 0
    while p * math.pow(a, lim) + q * math.pow(b, lim) <= m:
        lim += 1
    lim = min(lim, n)
    lim = min(lim, 40)

    # Initialize the lists of pending values
    pending1 = []
    pending2 = []

    # Calculate the powers of a and b
    powA = [1]
    powB = [1]
    for i in range(1, 42):
        powA.append(powA[i - 1] * a)
        powB.append(powB[i - 1] * b)

    # Calculate the pending values
    for t in range(2):
        max = lim // 2 if t == 0 else (lim + 1) // 2
        for i in range(1 << max):
            s = 0
            for j in range(max):
                if i & (1 << j) > 0:
                    s += p * powA[j + (t == 1 and lim // 2)] + q * powB[j + (t == 1 and lim // 2)]
                    if s > 10000000000000000:
                        break
            if t == 0:
                pending