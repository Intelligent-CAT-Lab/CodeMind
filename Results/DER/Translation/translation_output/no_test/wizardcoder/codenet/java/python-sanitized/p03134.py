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

if __name__ == '__main__':
    sc = Scanner(sys.stdin)
    pw = sys.stdout
    t = Task()
    t.solve(sc, pw)

class Scanner:
    def __init__(self, s):
        self.s = s
        self.buf = ''

    def readline(self):
        while True:
            if '\n' in self.buf:
                pos = self.buf.index('\n')
                r = self.buf[:pos]
                self.buf = self.buf[pos+1:]
                return r
            else:
                self.buf += self.s.read(1024).decode()

    def next(self):
        while True:
            if self.buf == '':
                self.buf = self.s.readline().decode()
            if self.buf == '':
                return None
            if self.buf[0] =='':
                self.buf = self.buf[1:]
            else:
                break
        pos = 0
        while pos < len(self.buf) and self.buf[pos]!='':
            pos += 1
        r = self.buf[:pos]
        self.buf = self.buf[pos+1:]
        return r

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def ready(self):
        return self.buf!= ''