import sys

def main():
    s = sys.stdin.readline().strip()
    n = len(s)
    a = [c == '1' for c in s]
    MOD = 1000000007

    pow2 = [1] * (n + 5)
    pow3 = [1] * (n + 5)
    cp2 = 1
    cp3 = 1

    for i in range(1, n + 5):
        pow2[i] = cp2
        pow3[i] = cp3
        cp2 = (cp2 * 2) % MOD
        cp3 = (cp3 * 3) % MOD

    an = 0
    ones = 0

    for i in range(n):
        if a[i]:
            digle = n - i - 1
            cur = (pow3[digle] * pow2[ones]) % MOD
            an = (an + cur) % MOD
            ones += 1

    cur = (pow2[ones]) % MOD
    an = (an + cur) % MOD

    print(an)

if __name__ == "__main__":
    main()