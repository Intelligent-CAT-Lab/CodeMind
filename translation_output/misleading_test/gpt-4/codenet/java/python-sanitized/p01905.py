def solve(N, M, a):
    b = [True] * (N * 2 - 1)
    for i in range(M):
        b[a[i] + N - 1] = False

    for i in range(N * 2 - 2, 0, -2):
        b[(i - 2) // 2] = b[i] or b[i - 1]

    ans = 0
    for i in range(N - 1):
        if b[i * 2 + 1] and b[i * 2 + 2]:
            ans += 1

    print(ans)

def main():
    N, M = map(int, input().split())
    a = [0] * M
    for i in range(M):
        a[i] = int(input())
    solve(N, M, a)

if __name__ == "__main__":
    main()