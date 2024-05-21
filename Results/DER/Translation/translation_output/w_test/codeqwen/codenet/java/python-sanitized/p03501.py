import sys

MOD = 998244353
#MOD = 1000000007
#INF = 1000000000000000007

def main():
    N = int(sys.stdin.readline())
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    print(min(A*N,B))

if __name__ == "__main__":
    main()