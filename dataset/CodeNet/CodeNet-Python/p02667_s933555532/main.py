T=input()
i=r=a=k=0
for c in T:a+=(i//2-k//2+(~k&1)*(len(T)-i))*(c=="1");i+=1;k-=(~k&1)*(c=='0')-1
print(a)