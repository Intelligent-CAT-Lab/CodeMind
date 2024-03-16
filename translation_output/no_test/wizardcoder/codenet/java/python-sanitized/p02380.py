import math

class p02380:
    def run(self, in_, out_):
        sc = java.util.Scanner(in_)
        a = sc.nextDouble()
        b = sc.nextDouble()
        cc = sc.nextDouble()
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        print(s)
        print(l)
        print(h)

        sc.close()

if __name__ == '__main__':
    p02380().run(java.lang.System.in, java.lang.System.out)