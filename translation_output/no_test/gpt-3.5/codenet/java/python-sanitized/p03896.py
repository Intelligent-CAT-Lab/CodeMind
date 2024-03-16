import sys
from io import BufferedWriter, BufferedReader
import os

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True
    
    def print(self, c):
        try:
            self.out.write(str(c))
            self.breaked = False
        except IOError as ex:
            raise
        
        return self
    
    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)
    
    def ans_int(self, i):
        return self.ans(str(i))
    
    def ans_int_arr(self, n):
        for ni in n:
            self.ans_int(ni)
        return self
    
    def ln(self):
        self.print(os.linesep)
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except IOError as ex:
                raise
        
        return self
    
    def close(self):
        try:
            self.out.close()
        except IOError as ex:
            raise

class LightScanner:
    def __init__(self, stream):
        self.reader = BufferedReader(stream)
        self.tokenizer = None
    
    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = self.reader.readLine()
            except IOError as ex:
                raise
        
        return self.tokenizer.nextToken()
    
    def ints(self):
        return int(self.string())

class I3y3sChallenge:
    def solve(self, testNumber, _in, out):
        n = _in.ints()
        if n == 2:
            out.ans_int(-1).ln()
            return
        
        ans = [[0]*(n-1) for _ in range(n)]
        
        for i in range(n-1):
            for j in range(n-1):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j + 1
        
        for i in range(n-1):
            ans[n-1][i] = (i + 1) % (n-1) + 1
        
        for row in ans:
            out.ans_int_arr(row).ln()

def main():
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_stream = LightScanner(inputStream)
    out_stream = LightWriter(BufferedWriter(outputStream))
    solver = I3y3sChallenge()
    solver.solve(1, in_stream, out_stream)
    out_stream.close()

if __name__ == "__main__":
    main()