import sys

MOD = 1000000007

def main():
    N, K = map(int, sys.stdin.readline().split())
    x = [0] * (K+1)
    for i in range(K, 0, -1):
        x[i] = pow(K//i, N, MOD)
        for j in range(i*2, K+1, i):
            x[i] -= x[j]
            if x[i] < 0: x[i] += MOD
        print(x[i])

if __name__ == "__main__":
    main()