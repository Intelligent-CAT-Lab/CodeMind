import sys

MOD = 1000000007

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    x = int(sys.stdin.readline().strip())
    s = a - b
    count = max(x - a, 0) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += - a + b
    total += x
    total %= MOD
    print(total)

if __name__ == "__main__":
    main()