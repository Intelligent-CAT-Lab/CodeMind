import math

class p01741:
    def run(self, inp, output):
        d = float(inp.readline())
        if d <1:
            output.write(str(d * math.sqrt(2)))
        elif d < math.sqrt(2):
            output.write("2")
        elif d < 2:
            output.write(str(d * math.sqrt(2)))
        elif d < math.sqrt(2) *