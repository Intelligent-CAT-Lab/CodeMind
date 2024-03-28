import sys

class p03748:
    dp = None
    mod = 1000000007

    def __init__(self):
        self.dp = [[[0]*2 for _ in range(101)] for _ in range(2)]

    def solve(self, n, m):
        self.dp[0][0][1] = 1
        for i in range(1, n+1):
            self.dp[0][i][0] = 1
        for i in range(m):
            for j in range(n+1):
                for k in range(2):
                    if j == 0:
                        if k == 0:
                            self.dp[(i+1)%2][0][0] = 0
                        else:
                            self.dp[(i+1)%2][0][1] = (self.dp[i%2][0][1] + (self.dp[i%2][1][0] + self.dp[i%2][1][1])%self.mod)%self.mod
                    elif j == 1:
                        if k == 0:
                            if n < 2:
                                self.dp[(i+1)%2][1][0] = 0
                            else:
                                self.dp[(i+1)%2][1][0] = (self.dp[i%2][1][0]+self.dp[i%2][2][0])%self.mod
                        else:
                            if n < 2:
                                self.dp[(i+1)%2][1][1] = (self.dp[i%2][1][0] + (self.dp[i%2][1][1]+self.dp[i%2][0][1])%self.mod)%self.mod
                            else:
                                self.dp[(i+1)%2][1][1] = (((self.dp[i%2][1][0]+self.dp[i%2][0][1])%self.mod + self.dp[i%2][1][1]*2%self.mod)%self.mod + self.dp[i%2][2][1])%self.mod
                    else:
                        self.dp[(i+1)%2][j][k] = (self.dp[i%2][j][k]+self.dp[i%2][j-1][k])%self.mod
                        if j+1 <= n:
                            self.dp[(i+1)%2][j][k] = (self.dp[(i+1)%2][j][k] + (self.dp[i%2][j][k]+self.dp[i%2][j+1][k])%self.mod)%self.mod
        ans = 0
        for i in range(n+1):
            ans = (ans + self.dp[m%2][i][1])%self.mod
        return ans

if __name__ == '__main__':
    n, m = map(int, sys.stdin.readline().split())
    solver = p03748()
    print(solver.solve(n, m))