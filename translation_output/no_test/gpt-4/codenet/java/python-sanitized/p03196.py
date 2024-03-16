import io
import sys
import math


DEBUG = len(sys.argv) > 1 and sys.argv[1] == "-DEBUG"

input_stream = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')


def dbg_print(*args):
    if DEBUG:
        print(*args, file=sys.stderr)


def read():
    return input_stream.readline().strip()


def read_int():
    return int(read())


def read_ints():
    return list(map(int, read().split()))


def prime_factors(n):
    factors = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        while n % i == 0:
            factors[i] = factors.get(i, 0) + 1
            n //= i
    if n > 1:
        factors[n] = factors.get(n, 0) + 1
    return factors


def solve(n, p):
    factors = prime_factors(p)
    ans = 1
    for factor, power in factors.items():
        if power >= n:
            ans *= factor ** (power // n)
    print(ans)


def main():
    n = read_int()
    p = read_int()
    solve(n, p)


if __name__ == "__main__":
    main()