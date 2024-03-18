import sys
import math
from typing import List, Tuple

class Methods:

    def print(self, *ar: object):
        print(ar)

    def yesno(self, out: 'TextWriter', b: bool):
        out.write("Yes\n" if b else "No\n")

    def YESNO(self, out: 'TextWriter', b: bool):
        out.write("YES\n" if b else "NO\n")

    def max(self, *ar: int):
        return max(ar)

    def min(self, *ar: int):
        return min(ar)

    def gcd(self, a: int, b: int):
        return math.gcd(a, b)

    def lcm(self, a: int, b: int):
        return a // math.gcd(a, b) * b

    def factorial(self, i: int):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i - 1)

    def manhat(self, x1: int, y1: int, x2: int, y2: int):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclid(self, x1: float, y1: float, x2: float, y2: float):
        return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

    def isPrime(self, n: int):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True


def solve(in_stream: 'TextReader', out: 'TextWriter', ms: Methods):
    out.write("square1001\n" if in_stream.readline().strip() == "ani" else "e869120\n")


class TextWriter:
    def write(self, s: str):
        sys.stdout.write(s)


class TextReader:
    def __init__(self, data: List[str]):
        self.lines = iter(data)

    def readline(self) -> str:
        return next(self.lines)


def main():
    in_stream = TextReader(sys.stdin.readlines())
    out = TextWriter()
    ms = Methods()
    solve(in_stream, out, ms)


if __name__ == "__main__":
    main()

# For the provided test input, the code can be directly run after this comment,
# or you can manually input the test data and uncomment the following section to execute the test case:

# test_input = ["ani"]
# in_stream = TextReader(test_input)
# out = TextWriter()
# ms = Methods()
# solve(in_stream, out, ms)