import sys

def solve():
    # Here is the main function
    one = nextIntArray()
    N = one[0]
    d = one[1]
    if N <= 2:
        myout(0)
        return
    N -= 3
    loop = N // 11
    amari = N % 11
    map = [
        [1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5],
        [0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5],
        [1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5],
        [0, 0, 1, 1, 2, 3, 3, 4, 4, 4, 5],
        [1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5],
        [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5],
        [0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5],
        [1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5],
        [0, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5],
        [1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5],
        [0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5]
    ]
    myout(loop * 5 + map[d][amari])

def nextIntArray():
    return list(map(int, sys.stdin.readline().split()))

def myout(t):
    print(t)

def myerr(t):
    print("debug:", t, file=sys.stderr)

def main():
    solve()
    flush()

if __name__ == "__main__":
    main()