import sys

MOD = 1000000007

# Fast input reading method
def ni():
    return int(sys.stdin.readline().strip())

# Starts here
if __name__ == "__main__":
    N = ni()

    l = len(str(N))
    m = 0
    for i in range(l):
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