N = int(input())
if N == 2:
    print(-1)
    exit()

ans = [[0 for j in range(N-1)] for i in range(N)]
for i in range(N):
    for j in range(N-1):
        ans[i][j] = (i+j+1)%N + 1

if N%2 == 0:
    m = N//2
    for i in range(m,N):
        ans[i][m],ans[i][m-1] = ans[i][m-1],ans[i][m]

for row in ans:
    print(' '.join(map(str,row)))
