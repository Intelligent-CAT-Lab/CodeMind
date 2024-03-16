import math

class p01741:
    def run(self, inp, out):
        d = float(inp.readline())
        if d < 1:
            out.write(str(d * math.sqrt(2)))
        elif d < math.sqrt(2):
            out.write("2")
        elif d < 2:
            out.write(str(d * math.sqrt(2)))
        elif d < math.sqrt(2) *