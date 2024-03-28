import sys
import io
from functools import reduce

MOD = 1_000_000_007

def solve():
    x = ni()
    y = ni()
    if (2 * y - x) % 3 != 0 or (2 * y - x) < 0:
        print(0)
        return
    a = (2 * y - x) // 3
    if (2 * x - y) % 3 != 0 or (2 * x - y) < 0:
        print(0)
        return
    b = (2 * x - y) // 3
    fif = enum_fif(3000000, MOD)
    print(C(a + b, a, MOD, fif))

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod

def enum_fif(n, mod):
    f = [1] * (n + 1)
    invf = [1] * (n + 1)
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    a = f[n]
    b = mod
    p, q = 1, 0
    while b > 0:
        c = a // b
        a, b, p, q = b, a % b, q, p - c * q
    invf[n] = p + mod if p < 0 else p
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    return f, invf

def ni():
    return int(ns())

def ns():
    while True:
        b = read_byte()
        if not is_space_char(b):
            sb = io.StringIO()
            while not (is_space_char(b) and b != 32):
                sb.write(chr(b))
                b = read_byte()
            return sb.getvalue()

def read_byte():
    if ptr_buf[0] >= len_buf[0]:
        ptr_buf[0] = 0
        len_buf[0] = len(sys.stdin.buffer.readinto(in_buf))
        if len_buf[0] <= 0:
            return -1
    return in_buf[ptr_buf[0]]

def is_space_char(c):
    return c in frozenset(b' \t\n\r\x0b\x0c')

len_buf, ptr_buf = [-1], [0]
in_buf = bytearray(1024)

if __name__ == "__main__":
    solve()