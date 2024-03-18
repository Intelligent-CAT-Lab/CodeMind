import sys

MOD = 1000000007

def ni():
    return int(input())

def nia(N):
    return list(map(int, input().split()))

def solve(N):
    l = len(str(N))
    m = 0
    for _ in range(l):
        m = (10 * m + 7) % N

    i = l
    vis = [False] * N

    while True:
        if vis[m]:
            print(-1)
            break
        
        vis[m] = True

        if m == 0:
            print(i)
            break

        m = (10 * m + 7) % N
        i += 1

if __name__ == "__main__":
    N = ni()
    solve(N)