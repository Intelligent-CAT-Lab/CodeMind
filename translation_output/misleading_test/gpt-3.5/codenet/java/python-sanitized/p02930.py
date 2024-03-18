import sys

def solve():
    n = int(input())

    ret = [[0] * n for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        row_output = []
        for j in range(i + 1, n):
            row_output.append(str(ret[i][j]))
        print(" ".join(row_output))

def dfs(left, right, level, ret):
    if left + 1 >= right:
        return
    
    center = (left + right) // 2

    for i in range(left, center):
        for j in range(center, right):
            ret[i][j] = level
            ret[j][i] = level

    dfs(left, center, level + 1, ret)
    dfs(center, right, level + 1, ret)

if __name__ == "__main__":
    solve()