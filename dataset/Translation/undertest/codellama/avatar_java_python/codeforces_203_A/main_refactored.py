class main:
    import sys
    
    class InputReader:
        def __init__(self, stream):
            self.reader = stream
            self.tokenizer = None
    
        def next(self):
            while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                try:
                    self.tokenizer = self.reader.readline()
                except IOError as e:
                    raise RuntimeError(e)
            return self.tokenizer.nextToken()
    
        def nextInt(self):
            return int(self.next())
    
    class ATwoProblems:
        def solve(self, test_number, in, out):
            points = in.nextInt()
            t = in.nextInt()
            a = in.nextInt()
            b = in.nextInt()
            ta = in.nextInt()
            tb = in.nextInt()
            for i in range(t):
                for j in range(t):
                    if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                        out.write("YES\n")
                        return
            out.write("NO\n")
    
    if __name__ == "__main__":
        input_stream = sys.stdin
        output_stream = sys.stdout
        in = InputReader(input_stream)
        out = PrintWriter(output_stream)
        solver = ATwoProblems()
        solver.solve(1, in, out)
        out.close()