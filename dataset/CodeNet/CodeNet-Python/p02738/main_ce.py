from numpy import*
n,M=map(int,"1 998244353".split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)