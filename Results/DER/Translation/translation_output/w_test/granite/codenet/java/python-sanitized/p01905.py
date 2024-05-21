import sys

def solve():
    N, M = map(int, input().split())
    A = list(map(int, input().split()))

    B = [True] * (2 * N - 1)
    for a in A:
        B[a + N - 1] = False

    for i in range(N * 2 - 2, 0, -2):
        if B[i] and B[i - 1]:
            B[(i - 2) // 2] = True
        elif B[i] or B[i - 1]:
            B[(i - 2) // 2] = True
        else:
            B[(i - 2) // 2] = False

    ans = 0
    for i in range(N - 1):
        if B[i * 2 + 1] and B[i * 2 + 2]:
            ans += 1

    print(ans)

input = sys.stdin.readline
solve()