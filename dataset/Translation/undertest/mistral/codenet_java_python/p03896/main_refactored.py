class main:
    import sys
    
    def solve(n):
        ans = [[0 for _ in range(n)] for _ in range(n)]
        for i in range(n):
            for j in range(i+1, n):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j + 1
        for i in range(n):
            ans[n-1][i] = (i+1) % (n-1) + 1
        for row in ans:
            print(" ".join(map(str, row)))
    
    if __name__ == "__main__":
        n = int(sys.stdin.readline())
        solve(n)