import math

def run(in_stream, out_stream):
    a, b, cc = map(float, in_stream.readline().split())
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out_stream.write(f"{s:.8f}\n")
    out_stream.write(f"{l:.8f}\n")
    out_stream.write(f"{h:.8f}\n")

if __name__ == "__main__":
    run(sys.stdin, sys.stdout)