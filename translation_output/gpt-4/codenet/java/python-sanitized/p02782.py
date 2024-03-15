def solve():
    # Creating factorial array
    factorial = [1, 1]
    for i in range(2, R2 + C2 + 11):
        factorial.append(mul(factorial[i - 1], i))

    a = f(R2, C2, factorial)
    b = f(R2, C1 - 1, factorial)
    c = f(R1 - 1, C2, factorial)
    d = f(R1 - 1, C1 - 1, factorial)

    return add(sub(sub(a, b), c), d)

def f(r, c, factorial):
    ret = factorial[r + c + 2]
    ret = div(ret, factorial[r + 1])
    ret = div(ret, factorial[c + 1])
    ret = sub(ret, 1)
    return ret

MOD = 1_000_000_007

def pow(base, exp):
    if exp == 0:
        return 1

    ans = 1
    base %= MOD
    while exp > 0:
        if (exp & 1) == 1:
            ans = mul(ans, base)

        base = mul(base, base)
        exp >>= 1
    return ans

def sub(a, b):
    c = a - b
    if c < 0:
        c += MOD
    return c

def div(a, b):
    return mul(a, pow(b, MOD - 2))

def add(a, b):
    c = a + b
    if c >= MOD:
        c %= MOD
    return c

def mul(a, b):
    c = (a * b) % MOD
    return c

# Main entry
if __name__ == '__main__':
    R1 = int(input())
    C1 = int(input())
    R2 = int(input())
    C2 = int(input())

    print(solve())