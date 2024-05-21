import sys

def solve():
    K = int(input())
    N = 50
    list = [K // N + i for i in range(N)]
    for i in range(K % N):
        list[i % N] += N + 1
        for j in range(N):
            list[j] -= 1
    print(N)
    print(*[str(x) for x in list], sep=' ')

if __name__ == '__main__':
    solve()