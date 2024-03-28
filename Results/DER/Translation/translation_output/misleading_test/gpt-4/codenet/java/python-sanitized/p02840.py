MOD = 998244353

def solve(n, x, d):
    if d == 0:
        if x == 0:
            return 1
        else:
            return n + 1

    if x == 0:
        return 1 + n * (n - 1) // 2

    m = {}

    for take in range(n + 1):
        b = take * x
        sum_val = take * (take - 1) // 2
        rsum = (n - take) * take + sum_val
        c = b // d
        add(m, b % d, (c + sum_val, c + rsum))

    ans = 0
    for k, v in m.items():
        v.sort()
        l, r = 0, 0
        f = False
        for p in v:
            if not f:
                f = True
                l, r = p
            else:
                if p[0] <= r:
                    r = max(r, p[1])
                else:
                    ans += r - l + 1
                    l, r = p
        ans += r - l + 1

    return ans

def add(m, k, v):
    if k not in m:
        m[k] = []
    m[k].append(v)

# Test case
input_str = input()
n, x, d = map(int, input_str.split())
print(solve(n, x, d))