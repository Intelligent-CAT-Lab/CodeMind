import math

class p02400:
    def main(self):
        r = float(input())
        pi = math.pi
        x = r*r*pi
        y = 2*r*pi
        print("{:.6f} {:.6f}".format(x,y))

p02400().main()