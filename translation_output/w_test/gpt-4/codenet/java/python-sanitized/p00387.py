import math
import sys

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
    
    def isPrime(self, n):
        if n <= 1 or (n % 2 == 0 and n > 2):
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

def solve(a, b, ms):
    print(max(1, (b + a - 1) // a))

def main():
    ms = Methods()
    tokens = sys.stdin.readline().split()
    a = int(tokens[0])
    b = int(tokens[1])
    solve(a, b, ms)

if __name__ == "__main__":
    main()