import math

def run(in_stream, out_stream):
    sc = in_stream
    a = sc.next_double()
    b = sc.next_double()
    cc = sc.next_double()
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out_stream.println(s)
    out_stream.println(l)
    out_stream.println(h)

    sc.close()

def main():
    run(sys.stdin, sys.stdout)

if __name__ == "__main__":
    main()