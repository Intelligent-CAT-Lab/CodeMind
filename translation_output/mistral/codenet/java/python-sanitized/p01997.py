import java.util
import java.util.stream
import java.io
import java.math

def solve(in: FastScanner, out: PrintWriter, ms: Methods):
    a = in.nextDouble()
    b = in.nextDouble()
    out.println(4.0/3.0*math.pi*b**3)

def main():
    in = FastScanner(System.in)
    out = PrintWriter(System.out)
    ms = Methods()
    solve(in, out, ms)
    in.close()
    out.close()

class Methods:

    def print(self, *args):
        print(args)

    def max(self, *args):
        return max(args)

    def min(self, *args):
        return min(args)

    def gcd(self, a: int, b: int):
        return b if b > 0 else a

    def lcm(self, a: int, b: int):
        return a//self.gcd(a,b)*b

    def factorial(self, n: int):
        if n == 1:
            return 1
        else:
            return n*self.factorial(n-1)

    def manhat(self, x1: int, y1: int, x2: int, y2: int):
        return abs(x1-x2)+abs(y1-y2)

    def euclid(self, x1: float, y1: float, x2: float, y2: float):
        return math.sqrt((x2-x1)**2+(y2-y1)**2)

    def isPrime(self, n: int):
        if n == 2:
            return True
        if n < 2 or