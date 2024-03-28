import sys

def solve():
    N = int(sys.stdin.readline())
    for h in range(1, 3500):
        for n in range(1, 3500):
            if 4*h*n-N*n-N*h!=0 and (N*h*n)/(4*h*n-N*n-N*h)>0 and (N*h*n)%(4*h*n-N*n-N*h)==0:
                print(h, n, (N*h*n)/(4*h*n-N*n-N*h))
                return

if __name__ == '__main__':
    solve()