N = int("3")
n = 0
while True:
    if 2**n >= N:
        break
    n += 1
P = 2**n
graph = [[0]*P for _ in range(P)]
for i in range(1, n+1):
    k = 2**i
    for p in range(P):
        if p%k < k//2:
            offset = p//k*k + k//2
            for q in range(k//2):
                graph[p][q+offset] = i
for i in range(N-1):
    for j in range(i+1, N):
        print(graph[i][j], end=' ')
    print()