import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N,A = map(int,read().split())
"""
最適解の構造を観察する。
・最後のトドメ以外に関しては、「コストn+A払って倍率をn倍する」
・nとして現れるのは2種まで
・結局、nをx回、n+1をy回という形で、パラメータn,x,yで書ける（x\geq 1とする）
・最終枚数は、n^x(n+1)^y、これがN以上になって欲しい
・コストは、A(x+y-1) + nx + (n+1)y
・x+yを固定するごとに解く
"""
def F(K):
    # x+y = K
    # n^K <= N < (n+1)^K
    n = int(N**(1/K))
    while (n-1)*n**(K-1) > N:
        n -= 1
    while n * (n+1)**(K-1) < N:
        n += 1
    # n^x(n+1)^y >= N, yを最小にとる。面倒なので全探索
    for y in range(K):
        x = K-y
        if n**x * (n+1)**y >= N:
            break
    cost = A*(K-1) + n*x + (n+1)*y
    return cost
answer = min(F(K) for K in range(1,50))
print(answer)