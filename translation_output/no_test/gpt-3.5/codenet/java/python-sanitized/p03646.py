import sys

def solve():
    K = int(input())
    N = 50
    list = [0] * N

    for i in range(N):
        list[i] = K // N + i

    for i in range(K % N):
        list[i % N] += N + 1
        for j in range(N):
            list[j] -= 1

    print(N)
    output = [str(num) for num in list]
    print(" ".join(output))

if __name__ == "__main__":
    solve()