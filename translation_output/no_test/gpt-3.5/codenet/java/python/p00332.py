```python
import sys

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.buffer
        self.input_buffer = b""
        self.buffer_ptr = 0

    def read(self, size=1):
        while len(self.input_buffer) < size:
            self.input_buffer += self.buffer.read1(4096)
        result = self.input_buffer[:size]
        self.input_buffer = self.input_buffer[size:]
        return result

    def readline(self):
        return self.buffer.readline().decode().strip()

    def next_int(self):
        return int(self.readline())

    def close(self):
        self.buffer.close()

class Methods:
    def __init__(self):
        pass

    def print(self, *args):
        print(*args)

    def max(self, *args):
        return max(args)

    def min(self, *args):
        return min(args)

    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def factorial(self, i):
        if i == 1:
            return 1
        return i * self.factorial(i - 1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclid(self, x1, y1, x2, y2):
        return ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5

    def is_prime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(n ** 0.5) + 1, 2):
            if n % i == 0:
                return False
        return True

def solve(in_stream, out_stream, ms):
    e = in_stream.next_int()
    y = in_stream.next_int()

    if e == 0:
        if 1868 <= y <= 1911:
            out_stream.write(f"M{y-1867}\n")
        elif 1912 <= y <= 1925:
            out_stream.write(f"T{y-1911}\n")
        elif 1926 <= y <= 1988:
            out_stream.write(f"S{y-1925}\n")
        else:
            out_stream.write(f"H{y-1988}\n")
    elif e == 1:
        out_stream.write(f"{1867 + y}\n")
    elif e == 2:
        out_stream.write(f"{1911 + y}\n")
    elif e == 3:
        out_stream.write(f"{1925 + y}\n")
    elif e == 4:
        out_stream.write(f"{1988 + y}\n")

if __name__ == "__main__":
    in_stream = FastScanner()
    ms = Methods()
    solve(in_stream, sys.stdout, ms)
    in_stream.close()
```
