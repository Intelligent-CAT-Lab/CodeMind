import sys

def solve(N):
    l = len(str(N))
    m = 0
    for i in range(l):
        m = (10 * m + 7) % N

    vis = [False] * N
    i = l
    while True:
        if vis[m]:
            return -1

        vis[m] = True

        if m == 0:
            return i

        m = (10 * m + 7) % N
        i += 1

if __name__ == "__main__":
    N = int(sys.stdin.readline())
    print(solve(N))