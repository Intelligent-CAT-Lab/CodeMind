# -*- coding: utf-8 -*-

#素数列挙
M=55555
m=int(M**0.5)+1

S=[ 0 for _ in range(M+1) ]

#エラトステネスの篩
for i in range(2,m+1):
    for j in range(i*2,M+1,i):
        S[j]=1

N=eval(input())
cnt=0
for i in range(2,M+1):
    if S[i]==0 and i%5==1:
        print(i, end=' ')
        cnt+=1
        if cnt==N:
            quit()
