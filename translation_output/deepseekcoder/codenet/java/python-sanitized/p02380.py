import math

class p02380:
    def run(self, inp, output):
        sc = [float(i) for i in inp.readline().split()]

        a, b, cc = sc[0], sc[1], math.radians(sc[2])

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        output.write(str(s) + '\n')
        output.write(str(l) + '\n')
        output.write(str(h) + '\n')

if __name__ == "__main__":
    p02380().run(sys.stdin, sys.stdout)