import math

class P02380:
    def run(self):
        a = float(input())
        b = float(input())
        cc = float(input())
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a**2 + b**2 - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        print(s)
        print(l)
        print(h)

if __name__ == "__main__":
    p = P02380()
    p.run()