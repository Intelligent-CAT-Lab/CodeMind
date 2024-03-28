def dfs(left, right, level, ret):
    if left + 1 >= right:
        return

    center = (left + right) // 2

    for i in range(left, center):
        for j in range(center, right):
            ret[i][j] = level
            ret[j][i] = level  # Assuming `ret[j][j] = level;` in the Java code should be `ret[j][i] = level;`

    dfs(left, center, level + 1, ret)
    dfs(center, right, level + 1, ret)

def solve():
    n = int(input())

    ret = [[0 for _ in range(n)] for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        row = ' '.join(map(str, ret[i][i + 1:]))
        print(row)

# Sample Test Case
solve()

#