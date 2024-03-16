Here is the translated code from Java to Python:

```python
import sys
import math
from typing import List, Tuple

class Methods:

    def print(self, *ar):
        print(ar)

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a

    def lcm(self, a, b):
        return (a // self.gcd(a, b)) * b

    def factorial(self, i):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i-1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclid(self, x1, y1, x2, y2):
        return math.sqrt((x2-x1)**2 + (y2-y1)**2)

    def isPrime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
        self.index = 0

    def next(self):
        if self.index == len(self.buffer):
            self.buffer = self.stream.readline().split()
            self.index = 0
        if not self.buffer:
            raise EOFError
        ret = self.buffer[self.index]
        self.index += 1
        return ret

    def nextInt(self):
        return int(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLong(self):
        return int(self.next())

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextDouble(self):
        return float(self.next())

    def nextDoubleArray(self, n):
        return [self.nextDouble() for _ in range(n)]

def print_char_map(map_2d):
    for row in map_2d:
        print(''.join(row))

def solve(in_scanner, ms):
    e = in_scanner.nextInt()
    y = in_scanner.nextInt()

    if e == 0:  # seireki
        if 1868 <= y <= 1911:  # meiji
            print("M" + str(y - 1867))
        elif 1912 <= y <= 1925:  # taishou
            print("T" + str(y - 1911))
        elif 1926 <= y <= 1988:  # shouwa
            print("S" + str(y - 1925))
        else:  # heisei
            print("H" + str(y - 1988))
    elif e == 1:  # meiji
        print(1867 + y)
    elif e == 2:  # taishou
        print(1911 + y)
    elif e == 3:  # shouwa
        print(1925 + y)
    elif e == 4:  # heisei
        print(1988 + y)

def main():
    in_scanner = FastScanner(sys.stdin)
    ms = Methods()
    solve(in_scanner, ms)
    
if __name__ == "__main__":
    main()
```

Please, keep in mind that the `printCharMap` Java method was translated into `print_char_map`. In Python, we usually use underscores between words in function names, following the PEP 8 style guide.

Also, I've assumed that the input will come from standard input (stdin) and that output is directly printed to the console with the `print()` function. The `System.out.close()` operation doesn't have a corresponding operation in Python because the standard output stream doesn’t need to be manually closed.

Note that Python inherently includes methods like `max`, `min`, and `abs`, therefore I have directly used those built-in functions instead of rewriting them. Some advanced Python methods (`lcm`, `gcd`, `factorial`) are available through the standard library (e.g., `math.gcd`, `math.lcm` since Python 3.9, and `math.factorial`), but I left them in the class to match the structure of the original Java code.
