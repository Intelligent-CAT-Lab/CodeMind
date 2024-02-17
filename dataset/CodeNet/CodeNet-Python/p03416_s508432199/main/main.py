A,B = list(map(int,input().split()))
ans = 0
for x in range(A,B+1):
    x = str(x)
    if x[:2] == x[:2:-1]:
        ans += 1
print(ans)