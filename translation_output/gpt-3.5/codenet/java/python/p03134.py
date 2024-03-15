```python
import sys

class Task:
    mod = 998244353

    def solve(self, sc, pw):
        cc = sc.next()
        n = len(cc)
        r, b = 0, 0
        dp = [[0] * (n+1) for _ in range(n+1)]
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

        combin = [[0] * (n+1) for _ in range(n+1)]
        for i in range(n + 1):
            combin[i][0] = combin[i][i] = 1
        for i in range(2, n + 1):
            for j in range(1, i):
                combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % self.mod

        tto = 0
        for i in range(min(r, n) + 1):
            ways = dp[n][i]
            lr = r - i
            lb = b - (n - i)
            if lb < 0:
                continue
            ways *= combin[n][lr]
            ways %= self.mod
            tto = (tto + ways) % self.mod
        pw.println(tto)

    class Scanner:
        def __init__(self, s):
            self.st = None
            if isinstance(s, str):
                self.br = s.splitlines()
            else:
                self.br = s

        def next(self):
            while self.st is None or not self.st:
                self.st = self.br.readline().split()
            return self.st.pop(0)

        def nextInt(self):
            return int(self.next())

        def nextLong(self):
            return int(self.next())

        def nextLine(self):
            return self.br.readline()

        def nextDouble(self):
            return float(self.next())

        def ready(self):
            return self.st or self.br.peek()

def main():
    sc = Task.Scanner(sys.stdin)
    pw = sys.stdout
    t = Task()
    t.solve(sc, pw)

if __name__ == '__main__':
    main()
```
