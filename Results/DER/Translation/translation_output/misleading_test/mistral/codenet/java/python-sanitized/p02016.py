def solve(in, out, ms):
    out.write(in.readline().strip() + "\n")

def main():
    in = FastScanner(sys.stdin)
    out = PrintWriter(sys.stdout)
    ms = Methods()
    solve(in, out, ms)
    in.close()
    out.close()

class Methods:
    def print(self, *args):
        print(args)

    def yesno(self, out, b):
        out.write(str(b) + "\n")

    def YESNO(self, out, b):
        out.write(str(b).upper() + "\n")

    def max(self, *args):
        return max(args)

    def min(self, *args):
        return min(args)

    def gcd(self, a, b):
        return b if b else a

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def factorial(self, n):
        if n == 1:
            return 1
        else:
            return n * self.factorial(n-1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1-x2) + abs(y1-y2)

    def euclid(self, x1, y1, x2, y2):
        return math.sqrt((x2-x1