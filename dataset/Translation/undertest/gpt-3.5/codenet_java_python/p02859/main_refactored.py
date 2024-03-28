class main:
    import sys
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
    
        def read(self):
            return self.stream.readline()
    
        def nextInt(self):
            return int(self.read().strip())
    
    class OutputWriter:
        def __init__(self, writer):
            self.writer = writer
    
        def println(self, i):
            self.writer.write(str(i) + '\n')
    
    def solve():
        r = indata.nextInt()
        outdata.println(r * r)
    
    if __name__ == "__main__":
        indata = InputReader(sys.stdin)
        outdata = OutputWriter(sys.stdout)
        solve()