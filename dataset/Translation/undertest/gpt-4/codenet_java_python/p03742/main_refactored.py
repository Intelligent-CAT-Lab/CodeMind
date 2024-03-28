class main:
    import sys
    import io
    
    class FastScanner:
        def __init__(self, stream=sys.stdin):
            self.stream = stream
            self.iterator = iter(stream.read().split())
    
        def next_int(self):
            return int(next(self.iterator, None))
    
        def next_long(self):
            return int(next(self.iterator, None))
    
        def next_double(self):
            return float(next(self.iterator, None))
    
        def next_char(self):
            return next(self.iterator, None)
        
        def next_str(self):
            return next(self.iterator, None)
    
    
    class p03742:
        MOD = int(1e9+7)
        
        def __init__(self):
            self.in_ = FastScanner()
            self.dp = [[False for _ in range(100)] for _ in range(100)]
            self.visited = [[False for _ in range(100)] for _ in range(100)]
      
        def println_yn(self, b):
            print("Brown" if b else "Alice")
      
        def dfs(self, x, y):
            if self.visited[x][y]:
                return self.dp[x][y]
            if x <= 1 and y <= 1:
                self.dp[x][y] = False
                self.visited[x][y] = True
                return False
    
            for i in range(2, x+1, 2):
                if not self.dfs(x-i, y+i//2):
                    self.dp[x][y] = True
                    self.visited[x][y] = True
                    return True
    
            for i in range(2, y+1, 2):
                if not self.dfs(x+i//2, y-i):
                    self.dp[x][y] = True
                    self.visited[x][y] = True
                    return True
    
            self.dp[x][y] = False
            self.visited[x][y] = True
            return False
    
        def solve(self):
            X = self.in_.next_long()
            Y = self.in_.next_long()
    
            self.println_yn(abs(X-Y) <= 1)
    
        @staticmethod
        def main():
            program = p03742()
            program.solve()
    
    
    if __name__ == '__main__':
        input_str = sys.stdin.read()
        sys.stdin = io.StringIO(input_str)
        p03742.main()