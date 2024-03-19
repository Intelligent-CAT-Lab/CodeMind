def solve(n):
    ret = [[0]*n for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        for j in range(i + 1, n):
            print(ret[i][j], end=' ')
        print()

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

n = int(input())
solve(n)