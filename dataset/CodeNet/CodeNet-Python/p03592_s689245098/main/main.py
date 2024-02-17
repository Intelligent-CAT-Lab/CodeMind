n,m,k = list(map(int, input().split()))
t = [0 for i in range(n*m+1)]
for i in range(n+1):
    a = i * m
    b = n - i - i
    for j in range(m):
        t[a] = 1
        a += b
if t[k] == 0:
    print('No')
else:
    print('Yes')
