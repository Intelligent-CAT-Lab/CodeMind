import sys

class LightScanner:
    def __init__(self, inp):
        self.input = inp
    
    def doubles(self):
        return map(float, self.input.readline().split())

class LightWriter:
    def __init__(self, out):
        self.output = out

    def ans(self, x, n):
        fmt = "{:.{}f}".format(x, n)
        self.output.write(fmt)
    
    def ln(self):
        self.output.write("\n")

    def close(self):
        self.output.close()

class AEquivalentResistance:
    def solve(self, r1, r2):
        light_writer.ans(1 / (1 / r1 + 1 / r2), 10)
        light_writer.ln()

if __name__ == "__main__":
    light_scanner = LightScanner(sys.stdin)
    light_writer = LightWriter(sys.stdout)
    
    r1, r2 = light_scanner.doubles()
    equivalent_resistance = AEquivalentResistance()
    equivalent_resistance.solve(r1, r2)
    
    light_writer.close()