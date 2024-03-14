import sys
import math

class Task:
    def __init__(self):
        self.mod = 998244353

    def solve(self, sc, pw):
        cc = sc.next()
        n = len(cc)
        r = 0
        b = 0
        dp = [[0 for i in range(n + 1)] for j in range(n + 1)]
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
        combin = [[0 for i in range(n + 1)] for j in range(n + 1)]
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
    TIME_START = 0
    TIME_END = 0
    task = Task()
    test_cases = int(sys.stdin.readline())
    for i in range(test_cases):
        if i!= 0:
            sys.stdin.readline()
        sc = sys.stdin
        pw = sys.stdout
        task.solve(sc, pw)
        pw.flush()
        if i!= test_cases - 1:
            pw.write('\n')
    TIME_END = time.time()
    print('Time used:'+ str(TIME_END - TIME_START) +'s')