import sys

MOD = 1000000007

def solve(a, b, x):
    s = a - b
    count = max(x - a, 0) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += - a + b
    total += x
    total %= MOD
    return total

def main():
    a, b, x = map(int, sys.stdin.readline().split())
    print(solve(a, b, x))

if __name__ == "__main__":
    main()