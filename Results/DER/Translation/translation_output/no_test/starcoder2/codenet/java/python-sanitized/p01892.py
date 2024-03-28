A,B = map(int,input().split())
N = int(input())
ans = abs(A-B)
for i in range(1,N+1):
    for j in range(1,N+1):
        if i*B%j != 0:
            continue
        ans = min(ans,abs(A-i*B//j))
print(ans)