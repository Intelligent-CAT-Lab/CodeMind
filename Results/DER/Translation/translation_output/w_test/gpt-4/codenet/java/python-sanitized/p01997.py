import math
import sys
from functools import reduce

# Define the helper methods class in Python
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
        return a // self.gcd(a, b) * b
    
    def factorial(self, i):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i - 1)
    
    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)
    
    def euclid(self, x1, y1, x2, y2):
        return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)
    
    def is_prime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

# Define the function to solve the problem
def solve(a, b):
    return (4.0 / 3.0 * math.pi * b ** 3)

if __name__ == "__main__":
    # Read the input from stdin
    ms = Methods()
    a, b = map(float, input().split())
    result = solve(a, b)
    print(result)