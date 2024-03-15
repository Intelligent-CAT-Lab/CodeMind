import math

def run(in, out):
    sc = math.scanner(in)
    a, b, cc = sc.next_double(), sc.next_double(), sc.next_double()
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out.write(str(s) + '\n')
    out.write(str(l) + '\n')
    out.write(str(h) + '\n')

    sc.close()

if __name__ == '__main__':
    run(sys.stdin, sys.stdout)