import sys

def solve():
    K = int(input())
    N = 50
    list_ = [K // N + i for i in range(N)]
    for i in range(K % N):
        list_[i % N] += N + 1
        for j in range(N):
            list_[j] -= 1
    print(N)
    print(' '.join(map(str, list_)))

if __name__ == "__main__":
    solve()