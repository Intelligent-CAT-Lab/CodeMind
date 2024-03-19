import sys

def solve():
    n = ni()

    ret = [[0]*n for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        for j in range(i + 1, n):
            sys.stdout.write(str(ret[i][j]) + " ")
        sys.stdout.write("\n")

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

def main():
    import threading
    start = threading.Thread(target=solve)
    start.start()
    start.join()

if __name__ == "__main__":
    main()

# Input/Output
is_ = sys.stdin
out = sys.stdout
reader = None
tokenizer = None

def next():
    global tokenizer
    while True:
        if tokenizer is None or not tokenizer.hasMoreTokens():
            try:
                line = is_.readline()
                if line == "":
                    return None
                tokenizer = java_util.StringTokenizer(line)
            except Exception:
                raise RuntimeError()
        else:
            return tokenizer.nextToken()

def ni():
    return int(next())

def nl():
    return long(next())

def nd():
    return double(next())

def ns():
    return next().strip()

def na(n):
    return [ni() for _ in range(n)]

def nal(n):
    return [nl() for _ in range(n)]

def ntable(n, m):
    return [na(m) for _ in range(n)]

def nlist(n, m):
    return [ntable(n, m) for _ in range(m)]

def tr(*args):
    if is_ != sys.stdin:
        print(args)