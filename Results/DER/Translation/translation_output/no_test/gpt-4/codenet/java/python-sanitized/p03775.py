import sys
import math
import random

class AtCoder:
    def __init__(self, N):
        self.N = N

    def solve(self):
        sqrt = int(math.sqrt(self.N))
        for i in range(sqrt, 0, -1):
            if self.N % i == 0:
                A = len(str(i))
                B = len(str(self.N // i))
                print(max(A, B))
                return

class FastScanner:
    def input(self):
        return sys.stdin.readline().strip()

    def next(self):
        return self.input()

    def next_long(self):
        return int(self.next())

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def array_int(self, N):
        return [self.next_int() for _ in range(N)]

    def array_long(self, N):
        return [self.next_long() for _ in range(N)]

    def array_double(self, N):
        return [self.next_double() for _ in range(N)]

    def array_string(self, N):
        return [self.next() for _ in range(N)]

    def random_int(self):
        value = random.randint(0, int(1e6))
        print(value)
        return value

    def random_int_array(self, N):
        array = [random.randint(0, int(1e6)) for _ in range(N)]
        print(array)
        return array

class My:
    @staticmethod
    def ans(b):
        print("Yes" if b else "No")

    @staticmethod
    def ANS(b):
        print("YES" if b else "NO")

    @staticmethod
    def sort(s):
        return ''.join(sorted(s))

    @staticmethod
    def reverse(s):
        return s[::-1]

    @staticmethod
    def reverse_array(array):
        return array[::-1]

    @staticmethod
    def min(*numbers):
        return min(numbers)

    @staticmethod
    def max(*numbers):
        return max(numbers)

    @staticmethod
    def sum(number):
        return sum(map(int, str(number)))

if __name__ == "__main__":
    sc = FastScanner()
    N = sc.next_long()
    
    problem = AtCoder(N)
    problem.solve()