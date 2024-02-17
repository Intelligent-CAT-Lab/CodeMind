L,R=map(int,input().split())
mod=10**9+7

DP_ini=[[[0 for i in range(2)] for j in range(2)] for k in range(64)]

import copy
ANS=0

for begin in range(64):
    DP=copy.deepcopy(DP_ini)

    if L<(1<<(begin+1)) and (1<<begin)<=R:

        if not(1<<begin <= L <  1<<(begin+1)) and not(1<<begin <= R <  1<<(begin+1)):
            DP[begin][0][0]=1

        elif 1<<begin <= L <  1<<(begin+1) and not(1<<begin <= R <  1<<(begin+1)):
            DP[begin][1][0]=1

        elif not(1<<begin <= L <  1<<(begin+1)) and 1<<begin <= R <  1<<(begin+1):
            DP[begin][0][1]=1

        else:
            DP[begin][1][1]=1

    for keta in range(begin-1,-1,-1):

        if L & (1<<keta)==0 and R & (1<<keta)==0:
            DP[keta][0][0]=DP[keta][0][0]+DP[keta+1][0][0]*3+DP[keta+1][0][1]*0+DP[keta+1][1][0]*1+DP[keta+1][1][1]*0
            DP[keta][0][1]=DP[keta][0][1]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*1+DP[keta+1][1][0]*0+DP[keta+1][1][1]*0
            DP[keta][1][0]=DP[keta][1][0]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*0+DP[keta+1][1][0]*2+DP[keta+1][1][1]*0
            DP[keta][1][1]=DP[keta][1][1]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*0+DP[keta+1][1][0]*0+DP[keta+1][1][1]*1

        elif L & (1<<keta)!=0 and R & (1<<keta)==0:
            DP[keta][0][0]=DP[keta][0][0]+DP[keta+1][0][0]*3+DP[keta+1][0][1]*0+DP[keta+1][1][0]*0+DP[keta+1][1][1]*0
            DP[keta][0][1]=DP[keta][0][1]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*1+DP[keta+1][1][0]*0+DP[keta+1][1][1]*0
            DP[keta][1][0]=DP[keta][1][0]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*0+DP[keta+1][1][0]*1+DP[keta+1][1][1]*0
            DP[keta][1][1]=DP[keta][1][1]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*0+DP[keta+1][1][0]*0+DP[keta+1][1][1]*0

        elif L & (1<<keta)==0 and R & (1<<keta)!=0:
            DP[keta][0][0]=DP[keta][0][0]+DP[keta+1][0][0]*3+DP[keta+1][0][1]*1+DP[keta+1][1][0]*1+DP[keta+1][1][1]*0
            DP[keta][0][1]=DP[keta][0][1]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*2+DP[keta+1][1][0]*0+DP[keta+1][1][1]*1
            DP[keta][1][0]=DP[keta][1][0]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*0+DP[keta+1][1][0]*2+DP[keta+1][1][1]*1
            DP[keta][1][1]=DP[keta][1][1]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*0+DP[keta+1][1][0]*0+DP[keta+1][1][1]*1
        else:
            DP[keta][0][0]=DP[keta][0][0]+DP[keta+1][0][0]*3+DP[keta+1][0][1]*1+DP[keta+1][1][0]*0+DP[keta+1][1][1]*0
            DP[keta][0][1]=DP[keta][0][1]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*2+DP[keta+1][1][0]*0+DP[keta+1][1][1]*0
            DP[keta][1][0]=DP[keta][1][0]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*0+DP[keta+1][1][0]*1+DP[keta+1][1][1]*0
            DP[keta][1][1]=DP[keta][1][1]+DP[keta+1][0][0]*0+DP[keta+1][0][1]*0+DP[keta+1][1][0]*0+DP[keta+1][1][1]*1

    #print(begin,DP[0])
    ANS+=sum(DP[0][0])+sum(DP[0][1])

print(ANS%mod)