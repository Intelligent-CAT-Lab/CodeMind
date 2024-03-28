class main:
    import sys
    
    def solve():
        n = int(input())
    
        ret = [[0] * n for _ in range(n)]
        dfs(0, n, 1, ret)
    
        for i in range(n - 1):
            sb = []
            for j in range(i + 1, n):
                sb.append(str(ret[i][j]) + " ")
            print(" ".join(sb))
    
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
    
    if __name__ == '__main__':
        if len(sys.argv) > 1:
            with open(sys.argv[1]) as f:
                input = f.readline
    
        solve()