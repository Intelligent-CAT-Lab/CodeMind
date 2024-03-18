import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = input().split()
            except EOFError:
                raise RuntimeError("End of file")
        return self.tokenizer.pop(0)
    
    def nextInt(self):
        return int(self.next())

class TaskA:
    def __init__(self):
        pass
    
    def solve(self, testNumber, in_stream, out_stream):
        n = in_stream.nextInt()
        x = n // 1000
        y = n % 1000
        if y == 0:
            out_stream.write('0\n')
        else:
            ans = 1000 * (x + 1) - n
            out_stream.write(str(ans) + '\n')

if __name__ == "__main__":
    in_stream = InputReader(sys.stdin)
    out_stream = sys.stdout
    solver = TaskA()
    solver.solve(1, in_stream, out_stream)