import sys
from typing import List, Union
from math import gcd, pow

# Utilities
MOD = int(1e9) + 7


class Utilities:
    @staticmethod
    def fast_pow_mod(b: int, x: int, mod: int) -> int:
        if x == 0:
            return 1
        if x == 1:
            return b % mod
        part = Utilities.fast_pow_mod(b, x // 2, mod)
        return (part * part % mod) * (b if x % 2 else 1) % mod


def main():
    global res
    N, K = map(int, sys.stdin.readline().split())
    x = [0] * (K + 1)
    for i in range(K, 0, -1):
        x[i] = Utilities.fast_pow_mod(K // i, N, MOD)
        for j in range(i * 2, K + 1, i):
            x[i] -= x[j]
            if x[i] < 0:
                x[i] += MOD
        res = (res + i * x[i] % MOD) % MOD
    print(res)


if __name__ == "__main__":
    res = 0
    main()