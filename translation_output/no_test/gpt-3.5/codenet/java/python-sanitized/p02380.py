class p02380:
    def run(self, _in, out):
        import math
        a, b, cc = map(float, _in.readline().split())
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        out.write(str(s) + '\n')
        out.write(str(l) + '\n')
        out.write(str(h) + '\n')

if __name__ == "__main__":
    p02380().run(sys.stdin, sys.stdout)