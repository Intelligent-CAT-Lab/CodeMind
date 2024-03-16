import sys
import io

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
    start = time.time()
    debug = sys.argv[1] if len(sys.argv) > 1 else None
    if debug != None:
        try:
            sys.stdin = open(debug, 'r')
        except:
            raise RuntimeError("Error opening file")
    solve()
    sys.stdout.flush()
    print(str(time.time() - start) + "ms")

if __name__ == "__main__":
    threading.Thread(target=main).start()

sys.stdin = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')

def next():
    return sys.stdin.readline().rstrip()

def nd():
    return float(next())

def nl():
    return int(next())

def na(n):
    return [ni() for _ in range(n)]

def ns():
    return next().decode('utf-8')

def nal(n):
    return [nl() for _ in range(n)]

def ntable(n, m):
    return [na(m) for _ in range(n)]

def nlist(n, m):
    return [ntable(n, m) for _ in range(m)]

def ni():
    return int(next())

def tr(o):
    print(o)