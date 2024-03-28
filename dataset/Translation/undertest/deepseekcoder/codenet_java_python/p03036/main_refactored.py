class main:
    import sys
    
    class BAlgae:
        def solve(self, inp):
            r = inp.nextInt()
            d = inp.nextInt()
            x = inp.nextInt()
    
            for _ in range(10):
                x = r * x - d
                print(x)
    
    class InputReader:
        def __init__(self, input_stream):
            self.stream = input_stream
    
        def nextInt(self):
            return int(self.stream.readline())
    
    if __name__ == "__main__":
        inp = InputReader(sys.stdin)
        BAlgae().solve(inp)