import sys

def solve():
    n = int(sys.stdin.readline())
    print(totient(n))

def totient(n):
    phi = [i for i in range(n)]
    for i in range(2, n):
        if phi[i-1] == i:
            for j in range(i, n, i):
                phi[j-1] = phi[j-1] / i * (i-1)
    return phi[n-1]

if __name__ == '__main__':
    solve()