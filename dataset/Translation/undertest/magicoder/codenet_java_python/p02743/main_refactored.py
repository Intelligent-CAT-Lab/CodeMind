class main:
    import sys
    
    class Solver:
        def __init__(self, sc, writer):
            self.sc = sc
            self.writer = writer
    
        def run(self):
            a = int(self.sc.readline())
            b = int(self.sc.readline())
            c = int(self.sc.readline())
            d = c - a - b
            if d > 0 and 4 * a * b < d * d:
                self.writer.write("Yes\n")
            else:
                self.writer.write("No\n")
    
    if __name__ == "__main__":
        sc = sys.stdin
        writer = sys.stdout
        solver = Solver(sc, writer)
        solver.run()
        writer.flush()