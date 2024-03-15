import sys

def solve(n, in, out):
    ans = [[0 for _ in range(n - 1)] for _ in range(n)]
    for i in range(n - 1):
        for j in range(i, n - 1):
            if i == j:
                ans[i][j] = n
            else:
                ans[i][j] = j + 1
    for i in range(n - 1):
        ans[n - 1][i] = (i + 1) % (n - 1) + 1
    for i in range(n):
        out.write(str(ans[i]) + '\n')

def main():
    n = int(input())
    if n == 2:
        out.write('-1\n')
        return
    for _ in range(n):
        solve(n, sys.stdin, sys.stdout)

if __name__ == '__main__':
    main()