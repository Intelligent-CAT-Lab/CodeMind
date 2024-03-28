class main:
    import sys
    
    def solve():
        n = int(sys.stdin.readline())
        ret = [[0 for i in range(n)] for j in range(n)]
        dfs(0, n, 1, ret)
        for i in range(n - 1):
            print(" ".join(map(str, ret[i][i + 1:])))
    
    def dfs(left, right, level, ret):
        if left + 1 >= right:
            return
        center = (left + right) // 2
        for i in range(left, center):
            for j in range(center, right):
                ret[i][j] = level
                ret[j][j] = level
        dfs(left, center, level + 1, ret)
        dfs(center, right, level + 1, ret)
    
    solve()