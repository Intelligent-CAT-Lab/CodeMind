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
    @staticmethod
    def next_int():
        return int(input().strip())

    @staticmethod
    def next_long():
        return int(input().strip())

    @staticmethod
    def next_float():
        return float(input().strip())

    @staticmethod
    def next():
        return input().strip()

    @staticmethod
    def array_int(N):
        return [int(x) for x in input().split()]

    @staticmethod
    def array_long(N):
        return [int(x) for x in input().split()]

    @staticmethod
    def array_float(N):
        return [float(x) for x in input().split()]

    @staticmethod
    def array(N):
        return input().split()

    @staticmethod
    def random_int():
        value = random.randint(0, int(1e6))
        print(value)
        return value

    @staticmethod
    def random_int_array(N):
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


if __name__ == '__main__':
    N = FastScanner.next_long()
    problem = AtCoder(N)
    problem.solve()