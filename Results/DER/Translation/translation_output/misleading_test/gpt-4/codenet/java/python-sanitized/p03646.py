def solve():
    K = int(input())
    N = 50
    lst = [K // N + i for i in range(N)]
    for i in range(K % N):
        lst[i % N] += N + 1
        for j in range(N):
            lst[j] -= 1
    print(N)
    print(" ".join(map(str, lst)))

if __name__ == "__main__":
    solve()