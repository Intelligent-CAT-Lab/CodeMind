import sys

def add(a, b):
    return (a + b) % 1000000007

def sub(a, b):
    return (a - b) % 1000000007

def mul(a, b):
    return (a * b) % 1000000007

def pow(a, e):
    if e == 0:
        return 1
    res = a
    for i in range(31 - len(bin(e)) + 1, -1, -1):
        if (e & (1 << i)) != 0:
            res = mul(res, a)
        res = mul(res, res)
    return res

def inv(a):
    return pow(a, 1000000006 - 2)

facts = [1]
factsInv = [inv(facts[0])]

for i in range(1, len(facts)):
    facts[i] = mul(facts[i - 1], i)
    factsInv.append(mul(factsInv[i], i))

def c(x, y):
    return mul(mul(facts[x + y], factsInv[x]), factsInv[y])

def solve():
    n, m = map(int, input().split())
    ans = 0
    for nOdd in range(min(m, n) + 1, m + 1, 2):
        cans = c(nOdd, n - nOdd)
        cans1 = c((3 * m - nOdd) // 2, n - 1)
        cans2 = mul(nOdd, c((m - nOdd) // 2, n - 1))
        if nOdd < m:
            cans2 += mul(n - nOdd, c((m - nOdd) // 2 - 1, n - 1))
        ans += mul(cans, sub(cans1, cans2))
    print(ans)

if __name__ == "__main__":
    sys.stdin.buffer = sys.stdout = sys.stderr = sys.stdin = sys.stdout = sys.stderr = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.stdout = sys.