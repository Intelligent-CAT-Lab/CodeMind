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
        ans[sy + i + 1][sx + j] = 'v'
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
        for carray in ans:
            print(''.join(carray))
            print()
    else:
        print("NO")

def main():
    n, m, a, b = map(int, input().split())
    ans = [['.'] * m for _ in range(n)]
    if n % 2 == 0 and m % 2 == 0:
        print_solve(even_solver(n, m, a, b, 0, 0))
    elif n % 2 == 0 or m % 2 == 0:
        if n % 2 == 0:
            for i in range(0, n, 2):
                if b > 0:
                    b -= 1
                    ans[i][0] = '^'
                    ans[i + 1][0] = 'v'
            print_solve(even_solver(n, m - 1, a, b, 0, 1))
        else:
            for j in range(0, m, 2):
                if a > 0:
                    a -= 1
                    ans[0][j] = '<'
                    ans[0][j + 1] = '>'
            print_solve(even_solver(n - 1, m, a, b, 1, 0))
    else:
        ans_ = [['<', '>', '^'], ['^', '.', 'v'], ['v', '<', '>']]
        for i in range(0, n - 1, 2):
            if b > 0:
                b -= 1
                ans[i][m - 1] = '^'
                ans[i + 1][m - 1] = 'v'
        for j in range(0, m - 1, 2):
            if a > 0:
                a -= 1
                ans[n - 1][j] = '<'
                ans[n - 1][j + 1] = '>'
        if a > 0 and b > 0 and a % 2 == 1:
            for i in range(0, 3):
                for j in range(0, 3):
                    ans[n - 3 + i][m - 3 + j] = ans_[i][j]
            a -= 1
            b -= 1
            print_solve(2 * (a + b) <= (n - 1) * (m - 1) - 4 and even_solver(n - 1, m - 1, a, b, 0, 0))
        else:
            print_solve(even_solver(n - 1, m - 1, a, b, 0, 0))

if __name__ == "__main__":
    main()