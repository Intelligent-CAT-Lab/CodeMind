import sys

def solve():
    n = int(input())
    ret = [[0 for _ in range(n)] for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        sb = StringBuilder()
        for j in range(i + 1, n):
            sb.append(ret[i][j] + " ")
        print(sb.strip())

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

if __name__ == "__main__":
    if len(sys.argv) > 1:
        is = sys.stdin
    else:
        is = sys.stdin
    out = sys.stdout
    reader = sys.stdin

    while True:
        try:
            tokenizer = tokenizer = sys.stdin.readline().strip().split()
            break
        except Exception as e:
            print(f"Error: {e}")
            sys.exit(1)

    while tokenizer:
        next()

    n = int(next())
    ret = [[0 for _ in range(n)] for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        sb = StringBuilder()
        for j in range(i + 1, n):
            sb.append(ret[i][j] + " ")
        print(sb.strip())