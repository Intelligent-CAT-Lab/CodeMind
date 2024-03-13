import math

class p02380:
    def run(self, inp, out):
        sc = inp.readline().split()
        a, b, cc = map(float, sc)
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        out.write(str(s) + '\n')
        out.write(str(l) + '\n')
        out.write(str(h) + '\n')

p02380().run(input, print)