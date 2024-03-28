```python
import sys

class Task:
    mod = 998244353

    def solve(self, sc, pw):
        cc = list(sc.next())
        n = len(cc)
        r, b = 0, 0
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

if __name__ == "__main__":
    sc = sys.stdin
    pw = sys.stdout
    t = Task()
    t.solve(sc, pw)
```

