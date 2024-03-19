import math

def run(inp, out):
    a, b, cc = map(float, inp.readline().split())
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out.write(str(s) + '\n')
    out.write(str(l) + '\n')
    out.write(str(h) + '\n')

def main():
    run(sys.stdin, sys.stdout)

if __name__ == "__main__":
    main()