def inpl(): return [int(i) for i in input().split()]
N, A, B, C, D = inpl()
for k in range(N+1):
    j = N-1-k
    if D*k - C*j >= B-A >= C*k - D*j:
        print('YES')
        break
else:
    print('NO')