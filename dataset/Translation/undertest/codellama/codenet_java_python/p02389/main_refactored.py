class main:
    import sys
    
    class InputReader:
        def __init__(self, stream):
            self.br = sys.stdin
            self.st = None
    
        def nextInt(self):
            while self.st is None or not self.st.hasMoreTokens():
                self.st = sys.stdin.readline()
            return int(self.st.nextToken())
    
        def nextLong(self):
            while self.st is None or not self.st.hasMoreTokens():
                self.st = sys.stdin.readline()
            return long(self.st.nextToken())
    
        def next(self):
            while self.st is None or not self.st.hasMoreTokens():
                self.st = sys.stdin.readline()
            return self.st.nextToken()
    
        def nextDouble(self):
            while self.st is None or not self.st.hasMoreTokens():
                self.st = sys.stdin.readline()
            return float(self.st.nextToken())
    
    class Solution:
        def solve(self):
            a = in.nextInt()
            b = in.nextInt()
            print(a*b, 2*a+2*b)
    
    if __name__ == "__main__":
        in = InputReader(sys.stdin)
        out = sys.stdout
        solver = Solution()
        solver.solve()
        out.close()