import math
import sys

def main():
    N, K = map(int, input().split())
    if N == 2:
        if K == 0:
            print(1)
            print("1 2")
        else:
            print(-1)
        return
    max_pairs = combination(N-1, 2)
    if K > max_pairs:
        print(-1)
        return
    M = N - 1 + (max_pairs - K)
    print(M)
    for i in range(2, N+1):
        print(1, i)
    cnt = max_pairs - K
    if cnt > 0:
        for i in range(2, N):
            for j in range(i+1, N+1):
                print(i, j)
                cnt -= 1
                if cnt <= 0:
                    return

def combination(n, k):
    return math.comb(n, k)

if __name__ == '__main__':
    main()