A,B,C,X,Y=list(map(int,input().split()))
ans = 10**9+7
for i in range(10**5+1):
  if ans > (2*C*i + max(0,Y-i)*B + max(0,X-i)*A):
    ans = 2*C*i + max(0,Y-i)*B + max(0,X-i)*A
print(ans)
