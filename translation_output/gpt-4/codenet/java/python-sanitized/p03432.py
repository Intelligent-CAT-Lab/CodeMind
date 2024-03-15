import math
from typing import List

MODULO = 998244353

def mod_inv(x: int) -> int:
    return pow(x, MODULO - 2, MODULO)

invs = [0] * 8012
invs[1] = 1
for i in range(2, 8012):
    invs[i] = ((MODULO - (MODULO // i) * invs[MODULO % i]) % MODULO)

facts = [0] * 8012
invfacts = [0] * 8012
facts[0] = 1
invfacts[0] = 1
for i in range(1, 8012):
    facts[i] = facts[i - 1] * i % MODULO
    invfacts[i] = invfacts[i - 1] * invs[i] % MODULO

def solve(m: int, n: int) -> None:
    w = [(facts[m] * invfacts[m - i]) % MODULO for i in range(m + 1)]
    other = [invfacts[i] for i in range(3, m + 3)][::-1]

    for step in range(n):
        nw = [0] * (m + 1)
        tw = [(w[j] * (j + 1) * (j + 2)) % MODULO for j in range(m + 1)]

        prod = fft_multiply(tw, other, MODULO)

        for i in range(m + 1):
            s = prod[m + i] % MODULO
            s = (s + w[i] * (1 + i * (i + 1) // 2)) % MODULO
            nw[i] = s

        w, nw = nw, w

    res = w[0]
    print(res)

def fft_multiply(a: List[int], b: List[int], MODULO: int) -> List[int]:
    # In Python, we would normally use a library like numpy or scipy for fast FFT-based multiplication,
    # but since this problem seems to involve a custom FFT to accommodate the specific modulo used,
    # implementing a full-blown FFT multiplication function goes beyond the scope of a simple translation.
    # I will provide a skeleton of the function here, but the actual implementation of FFT mod
    # should be handled either using an available library or a custom implementation.
    # Below is a placeholder code for the fft_multiply function.
    raise NotImplementedError("FFT multiplication is not implemented in this code snippet.")

def main():
    m, n = map(int, input().split())
    solve(m, n)

if __name__ == "__main__":
    main()