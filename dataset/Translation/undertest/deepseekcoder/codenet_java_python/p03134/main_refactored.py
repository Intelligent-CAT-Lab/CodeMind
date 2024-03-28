class main:
    import sys
    
    class Task:
        def __init__(self):
            self.mod = 998244353
    
        def solve(self, sc, pw):
            cc = sc.readline().strip()
            n = len(cc)
            r = 0
            b = 0
            dp = [[0]*(n+1) for _ in range(n+1)]
            dp[0][0] = 1
            for i in range(n):
                if cc[i] == '0':
                    r += 2
                elif cc[i] == '1':
                    r += 1
                    b += 1
                else:
                    b += 2
                for prev_use_red in range(i+1):
                    if prev_use_red+1 <= r:
                        dp[i+1][prev_use_red+1] += dp[i][prev_use_red]
                        dp[i+1][prev_use_red+1] %= self.mod
                    prev_use_blue = i - prev_use_red
                    if prev_use_blue+1 <= b:
                        dp[i+1][prev_use_red] += dp[i][prev_use_red]
                        dp[i+1][prev_use_red] %= self.mod
            combin = [[0]*(n+1) for _ in range(n+1)]
            for i in range(n+1):
                combin[i][0] = combin[i][i] = 1
            for i in range(2, n+1):
                for j in range(1, i):
                    combin[i][j] = (combin[i-1][j-1] + combin[i-1][j]) % self.mod
            tto = 0
            for i in range(min(r, n)+1):
                ways = dp[n][i]
                lr = r - i
                lb = b - (n - i)
                if lb < 0: continue
                ways *= combin[n][lr]
                ways %= self.mod
                tto = (tto + ways) % self.mod
            pw.write(str(tto)+'\n')
    
    
    if __name__ == "__main__":
        TIME_START, TIME_END = None, None
        runtime = Runtime.getRuntime()
        usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory()
        TIME_START = System.currentTimeMillis()
        t = Task()
        t.solve(sys.stdin, sys.stdout)
        TIME_END = System.currentTimeMillis()
        usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory()
        print("Memory increased:", (usedMemoryAfter-usedMemoryBefore) / 1000000 )
        print("Time used:", TIME_END - TIME_START, ".")