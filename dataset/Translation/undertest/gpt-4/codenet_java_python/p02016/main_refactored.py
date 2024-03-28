class main:
    import sys
    import math
    from functools import reduce
    
    class Methods:
    
        def print(self, *ar):
            print(ar)
    
        def yesno(self, out, b):
            out.write("Yes\n" if b else "No\n")
    
        def YESNO(self, out, b):
            out.write("YES\n" if b else "NO\n")
    
        def max(self, *ar):
            return max(ar)
    
        def min(self, *ar):
            return min(ar)
    
        def gcd(self, a, b):
            while b:
                a, b = b, a % b
            return a
    
        def lcm(self, a, b):
            return (a * b) // self.gcd(a, b)
    
        def factorial(self, i):
            return math.factorial(i)
    
        def manhat(self, x1, y1, x2, y2):
            return abs(x1 - x2) + abs(y1 - y2)
    
        def euclid(self, x1, y1, x2, y2):
            return math.hypot(x2 - x1, y2 - y1)
    
        def is_prime(self, n):
            if n == 2:
                return True
            if n < 2 or n % 2 == 0:
                return False
            for i in range(3, int(math.sqrt(n)) + 1, 2):
                if n % i == 0:
                    return False
            return True
    
    def solve(in_stream, out_stream, ms):
        out_stream.write("square1001\n" if in_stream.readline().strip() == "ani" else "e869120\n")
    
    class FastScanner:
    
        def __init__(self, stream):
            self.stream = stream
            self.buffer = ''
            self.position = 0
    
        def read(self):
            return self.stream.read()
    
        def readline(self):
            return self.stream.readline().rstrip('\n')
    
        def read_int(self):
            return int(self.readline())
    
        def read_int_array(self, n):
            return [int(x) for x in self.readline().split()]
    
        def read_long(self):
            return int(self.readline())
    
        def read_long_array(self, n):
            return [int(x) for x in self.readline().split()]
    
        def read_double(self):
            return float(self.readline())
    
        def read_double_array(self, n):
            return [float(x) for x in self.readline().split()]
    
    def main():
        in_stream = FastScanner(sys.stdin)
        out_stream = sys.stdout
        ms = Methods()
        solve(in_stream, out_stream, ms)
        in_stream.stream.close()
        out_stream.close()
    
    if __name__ == '__main__':
        main()