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
    import threading
    import sys
    import time

    def main():
        start = time.time()
        debug = sys.argv[1] if len(sys.argv) > 1 else None
        if debug:
            try:
                is = open(debug, 'r')
            except Exception as e:
                raise RuntimeError(e)
        reader = sys.stdin
        solve()
        print(f"{time.time() - start:.3f}s")

    main()

def next():
    while tokenizer is None or not tokenizer.hasMoreTokens():
        try:
            tokenizer = reader.readline().split()
        except Exception as e:
            raise RuntimeError(e)
    return tokenizer[0]

def nd():
    return float(next())

def nl():
    return int(next())

def na(n):
    a = [int(next()) for _ in range(n)]
    return a

def ns():
    return next().split()

def nal(n):
    a = [int(next()) for _ in range(n)]
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
    if is != sys.stdin:
        print(" ".join(str(x) for x in args))

# Sample test case
n = int(input())
print(int(nd()))