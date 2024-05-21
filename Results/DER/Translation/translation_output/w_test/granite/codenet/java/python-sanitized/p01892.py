import sys

def solve():
    A, B, N = map(int, input().split())
    ans = abs(A - B)
    for i in range(1, N + 1):
        for j in range(1, N + 1):
            if i * B % j!= 0:
                continue
            ans = min(ans, abs(A - i * B // j))
    print(ans)

if __name__ == '__main__':
    input = sys.stdin.readline
    solve()