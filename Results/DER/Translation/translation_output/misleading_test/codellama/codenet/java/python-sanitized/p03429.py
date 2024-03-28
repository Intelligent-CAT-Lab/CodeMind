import sys

def even_solver(n, m, a, b, sy, sx):
    if n * m < 2 * (a + b):
        return False
    if n * m == 2 * (a + b) and a % 2 == 1:
        return False
    i = 0
    j = 0
    while a > 0:
        ans[sy + i][sx + j] = '<'
        ans[sy + i][sx + 1 + j] = '>'
        a -= 1
        if a > 0:
            ans[sy + 1 + i][sx + j] = '<'
            ans[sy + 1 + i][sx + 1 + j] = '>'
        a -= 1
        j += 2
        if j >= m:
            j = 0
            i += 2
    while b > 0:
        ans[sy + i][sx + j] = '^'
        ans[sy + 1 + i][sx + j] = 'v'
        b -= 1
        if b > 0:
            ans[sy + i][sx + j + 1] = '^'
            ans[sy + 1 + i][sx + 1 + j] = 'v'
        b -= 1
        j += 2
        if j >= m:
            j = 0
            i += 2
    return True

def print_solve(t):
    if t:
        print("YES")
        for row in ans:
            print("".join(row))
            print()
    else:
        print("NO")

if __name__ == "__main__":
    N, M, A, B = map(int, sys.stdin.readline().split())
    ans = [['.'] * M for _ in range(N)]
    if N % 2 == 0 and M % 2 == 0:
        print_solve(even_solver(N, M, A, B, 0, 0))
    elif N % 2 == 0 or M % 2 == 0:
        if N % 2 == 0:
            for i in range(0, N, 2):
                if B > 0:
                    B -= 1
                    ans[i][0] = '^'
                    ans[i + 1][0] = 'v'
            print_solve(even_solver(N, M - 1, A, B, 0, 1))
        else:
            for j in range(0, M, 2):
                if A > 0:
                    A -= 1
                    ans[0][j] = '<'
                    ans[0][j + 1] = '>'
            print_solve(even_solver(N - 1, M, A, B, 1, 0))
    else:
        ans_ = [['<', '>', '^'], ['^', '.', 'v'], ['v', '<', '>']]
        for i in range(0, N - 1, 2):
            if B > 0: