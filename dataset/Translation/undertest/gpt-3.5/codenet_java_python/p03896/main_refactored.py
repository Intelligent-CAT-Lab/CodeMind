class main:
    import sys
    input = sys.stdin.readline
    
    class I3y3sChallenge:
        def solve(self, n):
            if n == 2:
                print(-1)
                return
            
            ans = [[0] * (n-1) for _ in range(n)]
            
            for i in range(n-1):
                for j in range(n-1):
                    if i == j:
                        ans[i][j] = n
                    else:
                        ans[i][j] = j + 1
            
            for i in range(n-1):
                ans[n-1][i] = (i + 1) % (n - 1) + 1
            
            for i in range(n):
                print(*ans[i])
    
    if __name__ == "__main__":
        n = int(input())
        solver = I3y3sChallenge()
        solver.solve(n)