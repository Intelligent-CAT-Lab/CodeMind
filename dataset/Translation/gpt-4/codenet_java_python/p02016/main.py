import sys
import math

class Methods:
    
    def print(self, *ar):
        print(str(ar))
    
    def yesno(self, b):
        print("Yes" if b else "No")
    
    def YESNO(self, b):
        print("YES" if b else "NO")
    
    def max(self, *ar):
        return max(ar)
    
    def min(self, *ar):
        return min(ar)
    
    def gcd(self, a, b):
        return math.gcd(a, b)
    
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

def solve(ms):
    s = input().strip()
    print("square1001" if s == "ani" else "e869120")

def main():
    ms = Methods()
    solve(ms)

if __name__ == "__main__":
    main()