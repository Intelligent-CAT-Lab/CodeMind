class main:
    import sys
    
    class Methods:
    
        def print(self, *ar):
            print(ar)
    
        def yesno(self, out, b):
            out.write("Yes\n") if b else out.write("No\n")
    
        def YESNO(self, out, b):
            out.write("YES\n") if b else out.write("NO\n")
    
        def max(self, *ar):
            return max(ar)
    
        def min(self, *ar):
            return min(ar)
    
        def gcd(self, a, b):
            return a if b == 0 else self.gcd(b, a % b)
    
        def lcm(self, a, b):
            return a * b // self.gcd(a, b)
    
        def factorial(self, i):
            return 1 if i == 1 else i * self.factorial(i - 1)
    
        def manhat(self, x1, y1, x2, y2):
            return abs(x1 - x2) + abs(y1 - y2)
    
        def euclid(self, x1, y1, x2, y2):
            return ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5
    
        def isPrime(self, n):
            if n == 2: return True
            if n < 2 or n % 2 == 0: return False
            for i in range(3, int(n ** 0.5) + 1, 2):
                if n % i == 0: return False
            return True
    
    
    class FastScanner:
    
        def __init__(self, inp=sys.stdin):
            self.inp = inp
    
        def next(self):
            return self.inp.readline().rstrip()
    
        def nextInt(self):
            return int(self.next())
    
        def nextDouble(self):
            return float(self.next())
    
    
    def solve(inp, out, ms):
        out