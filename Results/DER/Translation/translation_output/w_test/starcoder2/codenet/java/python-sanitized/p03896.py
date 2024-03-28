n = int(input())
if n == 2:
    print(-1)
else:
    ans = [[0 for i in range(n-1)] for j in range(n)]
    for i in range(n-1):
        for j in range(n-1):
            if i == j:
                ans[i][j] = n
            else:
                ans[i][j] = j+1
    for i in range(n-1):
        ans[n-1][i] = (i+1)%(n-1)+1
    for i in range(n):
        print(*ans[i])