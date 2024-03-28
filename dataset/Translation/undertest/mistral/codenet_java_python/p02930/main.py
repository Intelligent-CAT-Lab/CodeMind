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
    import sys
    import time

    def is_online():
        return len(sys.argv) > 1

    def get_input():
        if is_online():
            return sys.argv[1]
        else:
            return input()

    def next():
        while tokenizer == None or not tokenizer.hasMoreTokens():
            try:
                tokenizer = StringTokenizer(get_input())
            except Exception as e:
                raise RuntimeError(e)
        return tokenizer.nextToken()

    def nd():
        return float(next())

    def nl():
        return long(next())

    def na(n):
        a = [int(next()) for _ in range(n)]
        return a

    def ns():
        return next().tochar()

    def nal(n):
        a = [long(next()) for _ in range(n)]
        return a

    def ntable(n, m):
        table = [[int(next()) for _ in range(m)] for _ in range(n)]
        return table

    def nlist(n, m):
        table = [[int(next()) for _ in range(n)] for _ in range(m)]
        return table

    def ni():
        return int(next())

    def tr(*args):
        if is_online():
            print(" ".join(str(arg) for arg in args))
        else:
            print(" ".join(str(arg) for arg in args))

    solve()
    tr()