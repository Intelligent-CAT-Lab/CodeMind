M=8**7
m=M*476+1
f=[1]*M
g=[1]*M
h=[1]*M
i=2
while i<M:f[i]=f[i-1]*i%m;h[i]=-h[m%i]*(m//i)%m;g[i]=g[i-1]*h[i]%m;i+=1
a=0
b=j=1
A,B=map(int,"1 1".split())
if A<B:A,B=B,A
while j<=B:a+=b*f[A+B-j]*g[B-j];b=b*2%m;j+=1
print((a*f[B]*g[A+B]+A)%m)