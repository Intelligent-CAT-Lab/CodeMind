class main:
    import sys
    
    class FastReader:
        def __init__(self):
            self.lines = sys.stdin.readlines()
            self.line_idx = 0
            self.token_idx = 0
    
        def next(self):
            line = self.lines[self.line_idx].strip().split()
            if self.token_idx >= len(line):
                self.line_idx += 1
                self.token_idx = 0
                line = self.lines[self.line_idx].strip().split()
            self.token_idx += 1
            return line[self.token_idx - 1]
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return int(self.next())
    
        def nextDouble(self):
            return float(self.next())
    
        def nextLine(self):
            return self.lines[self.line_idx].strip()
    
    class Solution:
        def solve(self):
            sc = FastReader()
            
            L = sc.nextInt()
            R = sc.nextInt()
    
            R -= L
            L %= 2019
            R += L
    
            res = 2019 # max value
    
            if R - L > 2019:
                print(0)
                return
    
            for i in range(L, R+1):
                for j in range(L, i):
                    res = min(res, (i * j) % 2019)
    
            print(res)
    
    ob = Solution()
    ob.solve()