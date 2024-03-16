import math
import sys

def solve(a, b):
    print(4.0/3.0 * math.pi * b**3)
 
def main():
    inputs = sys.stdin.readline().strip().split()
    a = float(inputs[0])
    b = float(inputs[1])
    solve(a, b)

class Methods:
    
    @staticmethod
    def print(*ar):
        print(ar)
    
    @staticmethod
    def max(*ar):
        return max(ar)
    
    @staticmethod
    def min(*ar):
        return min(ar)
    
    @staticmethod
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a
    
    @staticmethod
    def lcm(a, b):
        return a // Methods.gcd(a, b) * b
    
    @staticmethod
    def factorial(i):
        if i == 1:
            return 1
        else:
            return i * Methods.factorial(i - 1)
    
    @staticmethod
    def manhat(x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)
    
    @staticmethod
    def euclid(x1, y1, x2, y2):
        return math.sqrt((x2 - x1)**2 + (y2 - y1)**2)
    
    @staticmethod
    def is_prime(n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

# Run the main function when the script is executed
if __name__ == "__main__":
    main()