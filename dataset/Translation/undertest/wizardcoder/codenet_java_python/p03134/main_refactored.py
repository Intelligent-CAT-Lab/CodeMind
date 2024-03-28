class main:
    import sys
    import math
    
    class Task:
        def __init__(self):
            self.mod = 998244353
    
        def solve(self, sc, pw):
            cc = sc.next().strip()
            n = len(cc)
            r = 0
            b = 0
            dp = [[0] * (n + 1) for _ in range(n + 1)]
            dp[0][0] = 1
            for i in range(n):
                if cc[i] == '0':
                    r += 2
                elif cc[i] == '1':
                    r += 1
                    b += 1
                else:
                    b += 2
                for prevUseRed in range(i + 1):
                    if prevUseRed + 1 <= r:
                        dp[i + 1][prevUseRed + 1] += dp[i][prevUseRed]
                        dp[i + 1][prevUseRed + 1] %= self.mod
                    prevUseBlue = i - prevUseRed
                    if prevUseBlue + 1 <= b:
                        dp[i + 1][prevUseRed] += dp[i][prevUseRed]
                        dp[i + 1][prevUseRed] %= self.mod
            combin = [[0] * (n + 1) for _ in range(n + 1)]
            for i in range(n + 1):
                combin[i][0] = combin[i][i] = 1
            for i in range(2, n + 1):
                for j in range(1, i):
                    combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % self.mod
            tto = 0
            for i in range(n + 1):
                ways = dp[n][i]
                lr = r - i
                lb = b - (n - i)
                if lb < 0:
                    continue
                ways *= combin[n][lr]
                ways %= self.mod
                tto = (tto + ways) % self.mod
            pw.write(str(tto) + '\n')
    
    def main():
        sc = Scanner(sys.stdin)
        pw = PrintWriter(sys.stdout)
        t = Task()
        t.solve(sc, pw)
        pw.close()
    
    class Scanner:
        def __init__(self, s):
            self.s = s
            self.buf = ''
            self.tokens = []
    
        def readline(self):
            while True:
                if self.buf:
                    try:
                        return self.buf.pop(0)
                    except IndexError:
                        pass
                self.buf = self.s.readline().strip().split()
            return ''
    
        def read(self):
            while True:
                if self.buf:
                    try:
                        return self.buf.pop(0)
                    except IndexError:
                        pass
                self.buf = self.s.read().strip().split()
            return ''
    
        def next(self):
            while True:
                if self.tokens:
                    try:
                        return self.tokens.pop(0)
                    except IndexError:
                        pass
                self.tokens = self.readline().split()
            return ''
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return long(self.next())
    
        def nextDouble(self):
            return float(self.next())
    
    class PrintWriter:
        def __init__(self, s):
            self.s = s
    
        def write(self, x):
            self.s.write(x)
    
        def println(self, x=''):
            self.s.write(x + '\n')
    
        def flush(self):
            self.s.flush()
    
    if __name__ == '__main__':
        main()