class main:
    def main():
        n = int(input())
        ret = [[0] * n for _ in range(n)]
        dfs(0, n, 1, ret)
    
        for i in range(n - 1):
            print(*ret[i][i + 1:], sep=" ")
    
    def dfs(left, right, level, ret):
        if left + 1 >= right:
            return
    
        center = (left + right) // 2
    
        for i in range(left, center):
            for j in range(center, right):
                ret[i][j] = level
    
        dfs(left, center, level + 1, ret)
        dfs(center, right, level + 1, ret)
    
    if __name__ == "__main__":
        main()