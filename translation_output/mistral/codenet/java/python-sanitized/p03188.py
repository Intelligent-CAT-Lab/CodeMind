def solve():
    k = int(input())

    if k == 1:
        print(1)
        print(1)
        return

    n = (k + 3) // 2 / 4 * 2

    ret = [[0 for j in range(n)] for i in range(n)]
    for i in range(n):
        for j in range(n):
            ret[i][j] = (i % 2 == 0 ? 0 : n) + (i + j) % n

    for i in range(n):
        for j in range(n):
            if ret[i][j] >= k:
                ret[i][j] = (ret[i][j] - n) % k

    print(n)
    for i in range(n):
        for j in range(n):
            print((ret[i][j] + 1), end=" ")
        print()

def main():
    start = time.time()
    debug = input() if len(sys.argv) > 1 else None
    if debug:
        try:
            is = open(debug, 'r')
        except Exception as e:
            raise RuntimeError(e)
    reader = BufferedReader(InputStreamReader(is or sys.stdin), 32768)
    solve()
    print(f"{time.time() - start:.3f}ms")

is = sys.stdin
out = sys.stdout
tokenizer = None
reader = None

def next():
    while tokenizer is None or not tokenizer.hasMoreTokens():
        try:
            tokenizer = StringTokenizer(reader.readline())
        except Exception as e:
            raise RuntimeError(e)
    return tokenizer.nextToken()

def nd():
    return float(next())

def nl():
    return int(next())

def na(n):
    a = [int(next()) for i in range(n)]
    return a

def ns():
    return next().tochar()

def nal(n):
    a = [int(next()) for i in range(n)]
    return a

def ntable(n, m):
    table = [[int(next()) for j in range(m)] for i in range(n)]
    return table

def nlist(n, m):
    table = [[int(next()) for i in range(n)] for j in range(m)]
    return table

def ni():
    return int(next())

def tr(*args):
    if is != sys.stdin:
        print(args)

if __name__ == '__main__':
    main()