def solve():
    k = int(input())

    if k == 1:
        print(1)
        print(1)
        return

    n = (k + 3) // // divide by 4 and round down
    table = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            table[i][j] = (i % 2 == 0 ? 0 : n) + (i + j) % n

    for i in range(n):
        for j in range(n):
            if table[i][j] >= k:
                table[i][j] = (table[i][j] - n) % k

    print(n)
    for i in range(n):
        for j in range(n):
            print(table[i][j] + 1, end=" ")
        print()

if __name__ == "__main__":
    import sys
    import time

    def is_debugging():
        if len(sys.argv) > 1:
            try:
                with open(sys.argv[1], "rb") as f:
                    is = f.read()
            except Exception as e:
                raise RuntimeError(e)
        return True

    def main():
        start = time.time()
        if is_debugging():
            is = sys.stdin
        reader = sys.stdin
        solve()
        print(f"{time.time() - start:.3f}ms")

    is = sys.stdin
    reader = sys.stdin
    solve()


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


if __name__ == "__main__":
    main()