import java.util
import java.util.stream
import java.io
import java.math

def solve(in: FastScanner, out: PrintWriter, ms: Methods):
    out.println(in.next().equals("ani")? "square1001" : "e869120")

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

    def yesno(self, out, b):
        out.println(b?"Yes":"No")

    def YESNO(self, out, b):
        out.println(b?"YES":"NO")

    def max(self, *args):
        return max(args)

    def min(self, *args):
        return min(args)

    def gcd(self, a: int, b: int):
        return b>0?gcd(b,a%b):a

    def lcm(self, a: int, b: int):
        return a//gcd(a,b)*b

    def factorial(self, i: int):
        if i == 1:
            return 1
        else:
            return i*factorial(i-1)

    def manhat(self, x1: int, y1: int, x2: int, y2: int):
        return abs(x1-x2)+abs(y1-y