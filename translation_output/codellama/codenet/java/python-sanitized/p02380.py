import math

def run(in, out):
    sc = Scanner(in)
    a, b, cc = sc.nextDouble(), sc.nextDouble(), sc.nextDouble()
    cc = math.radians(cc)
    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)
    out.println(s)
    out.println(l)
    out.println(h)
    sc.close()

if __name__ == "__main__":
    run(sys.stdin, sys.stdout)