n,m,k=map(int,"2 2 2".split())
ans=0
INF=10**9+7
if n<=m:
    M=-(m-1)*m*(2*m-1)//3+m*m*(m-1)
    Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6
    M=M%INF
    Ms=Ms%INF
    for i in range(1,n+1):
        for j in range(i,n+1):
            if i==j:
                ans=ans+Ms
            else:
                d=j-i
                ans=ans+d*m**2+M
            ans=ans%INF
else:
    (n,m)=(m,n)
    M=-(m-1)*m*(2*m-1)//3+m*m*(m-1)
    Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6
    M=M%INF
    Ms=Ms%INF
    for i in range(1,n+1):
        for j in range(i,n+1):
            if i==j:
                ans=ans+Ms
            else:
                d=j-i
                ans=ans+d*m**2+M
            ans=ans%INF
import math
ans=(math.factorial(n*m-2)//(math.factorial(n*m-k)*math.factorial(k-2)))*ans
ans=ans%INF
print(ans)
