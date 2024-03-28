import sys
import itertools
from math import gcd, sqrt

class Methods:
    def __init__(self):
        pass

    def print(self, *ar):
        print(ar)

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def lcm(self, a, b):
        return a // gcd(a, b) * b

    def factorial(self, i):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i-1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1-x2) + abs(y1-y2)

    def euclid(self, x1, y1, x2, y2):
        return sqrt((x2-x1)**2 + (y2-y1)**2)

    def is_prime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

def solve(s):
    length = len(s)
    ans = 0

    for i in range(1, length - 2):
        for j in range(i + 1, length - 1):
            for k in range(j + 1, length):
                parts = [s[0:i], s[i:j], s[j:k], s[k:length]]
                try:
                    nums = [int(part) for part in parts]
                except ValueError:
                    continue
                if all(part.lstrip("0") == str(num) for part, num in zip(parts, nums)) and all(0 <= num <= 255 for num in nums):
                    ans += 1

    return ans

# Reading from standard input (stdin) for the sample test case
if __name__ == '__main__':
    s = input().strip()
    result = solve(s)
    print(result)