n, m = list(map(int, input().split()))

for i in range(0, n+1):
    f = 2 * i + 4 * (n - i)
    if f == m:
        print('Yes')
        break
    
else:
    print('No')