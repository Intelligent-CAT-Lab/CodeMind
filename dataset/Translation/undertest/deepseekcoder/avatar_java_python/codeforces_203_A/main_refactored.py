class main:
    import sys
    
    class ATwoProblems:
        def solve(self, inp, out):
            points = inp.read_int()
            t = inp.read_int()
            a = inp.read_int()
            b = inp.read_int()
            ta = inp.read_int()
            tb = inp.read_int()
            for i in range(t):
                for j in range(t):
                    if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                        out.write("YES\n")
                        return
            out.write("NO\n")
    
    class InputReader:
        def __init__(self, input=sys.stdin):
            self.input = input
            self.split = []
    
        def read_line(self):
            return self.input.readline().strip()
    
        def read_ints(self):
            return list(map(int, self.read_line().split()))
    
        def read_int(self):
            return self.read_ints()[0]
    
    def main():
        inp = InputReader()
        out = sys.stdout
        solver = ATwoProblems()
        solver.solve(inp, out)
        out.flush()
    
    if __name__ == "__main__":
        main()