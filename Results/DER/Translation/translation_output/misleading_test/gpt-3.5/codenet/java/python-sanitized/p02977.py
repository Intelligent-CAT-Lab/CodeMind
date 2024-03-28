import sys
import math

class ExtendedScanner:
    def __init__(self):
        self.input = sys.stdin.buffer
        self.buf = bytearray()
        self.ptr = 0

    def read_byte(self):
        if not self.buf or self.ptr >= len(self.buf):
            self.buf = self.input.read(1 << 16)
            self.ptr = 0
        if not self.buf:
            return -1
        self.ptr += 1
        return self.buf[self.ptr - 1]

    def has_next_byte(self):
        while self.read_byte() != -1 and not (33 <= self.buf[self.ptr - 1] <= 126):
            pass
        return self.buf[self.ptr - 1] != -1

    def next_sequence(self):
        if not self.has_next_byte():
            raise Exception("No more elements to read.")
        sb = bytearray()
        b = self.read_byte()
        while 33 <= b <= 126:
            sb.append(b)
            b = self.read_byte()
        return sb.decode()

    def next_int(self):
        return int(self.next_sequence())

def solve_input():
    sc = ExtendedScanner()
    out = sys.stdout.buffer

    n = sc.next_int()
    if (n & -n) == n:
        out.write(b"No\n")
        return

    out.write(b"Yes\n")
    if n == 3:
        out.write("1 2\n2 3\n3 4\n4 5\n5 6\n".encode())
        return

    k = int(math.log2(n))
    for i in range(1, 2 ** k - 1):
        out.write(f"{i} {i + 1}\n".encode())
    out.write(f"{(1 << k) - 1} {n + 1}\n".encode())
    for i in range(1, 2 ** k - 1):
        out.write(f"{n + i} {n + i + 1}\n".encode())
    out.write(f"{(1 << k) + 1} {n + (1 << k)}\n".encode())
    out.write(f"{n + (1 << k)} {n + 1}\n".encode())
    out.write(f"{n + 1} {n + (1 << k) + 1}\n".encode())
    for j in range(2, n - (1 << k) + 1):
        out.write(f"{n + j} {n + (1 << k) + j}\n".encode())
        out.write(f"{n + (1 << k) + j - 1} {(1 << k) + j}\n".encode())

solve_input()