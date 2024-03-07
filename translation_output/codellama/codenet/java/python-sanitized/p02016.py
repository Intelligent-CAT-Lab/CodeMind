import java.util
import java.util.stream
import java.io
import java.math

class p02016:
    def solve(in, out, ms):
        out.println(in.next().equals("ani")? "square1001" : "e869120")

    def main(args):
        in = FastScanner(System.in)
        out = PrintWriter(System.out)
        ms = Methods()
        solve(in, out, ms)
        in.close()
        out.close()

    class Methods:
        def print(ar):
            System.out.println(Arrays.deepToString(ar))

        def yesno(out, b):
            out.println(b?"Yes":"No")

        def YESNO(out, b):
            out.println(b?"YES":"NO")

        def max(ar):
            Arrays.sort(ar)
            return ar[ar.length-1]

        def min(ar):
            Arrays.sort(ar)
            return ar[0]

        def gcd(a, b):
            return b>0?gcd(b,a%b):a

        def lcm(a, b):
            return a/gcd(a,b)*b

        def factorial(i):
            if i==1:
                return 1
            else:
                return i*factorial(i-1)

        def manhat(x1, y1, x2, y2):
            return Math