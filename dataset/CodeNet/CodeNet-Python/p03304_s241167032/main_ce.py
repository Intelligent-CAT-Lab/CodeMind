n,m,d=map(int,"2 3 1".split())
ans=2*(n-d)*(m-1)/pow(n,2)
if d==0:
    ans=(m-1)/n
print(ans)