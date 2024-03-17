import math

def run(in_stream, out_stream):
    a = float(in_stream.readline())
    b = float(in_stream.readline())
    cc = float(in_stream.readline())
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out_stream.write(str(s) + '\n')
    out_stream.write(str(l) + '\n')
    out_stream.write(str(h) + '\n')

if __name__ == '__main__':
    import sys
    run(sys.stdin, sys.stdout)