import sys

def solve():
    K = int(sys.stdin.readline())
    N = 50
    list = [K // N + i for i in range(N)]
    for i in range(K % N):
        list[i % N] += N + 1
        for j in range(N):
            list[j] -= 1
    print(N)
    output = [str(x) for x in list]
    print(" ".join(output))

if __name__ == "__main__":
    solve()