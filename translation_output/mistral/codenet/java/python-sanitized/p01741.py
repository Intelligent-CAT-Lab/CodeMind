import math

def run(in, out):
    sc = input(in)
    d = float(sc)
    if d < 1:
        out.write(str(d * math.sqrt(2)))
    elif d < math.sqrt(2):
        out.write("2")
    elif d < 2:
        out.write(str(d * math.sqrt(2)))
    elif d < math.sqrt(2) *