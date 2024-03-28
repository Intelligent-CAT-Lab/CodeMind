def main():
    MOD = 1000000007
    a = int(input())
    b = int(input())
    x = int(input())
    s = a - b
    count = max(x - a, 0) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += -a + b
    total += x
    total %= MOD
    print(total)

if __name__ == "__main__":
    main()