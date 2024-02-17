N, M = list(map(int, input().split()))

if max(N,M) == 1 :
    print((1))
elif min(N,M) == 1 :
    print((N*M - 2))
else :
    print(((N-2)*(M-2)))
