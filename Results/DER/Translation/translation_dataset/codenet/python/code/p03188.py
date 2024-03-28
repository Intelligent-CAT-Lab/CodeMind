K=int(input())

if K<=500:
    print(K)
    for i in range(1,K+1):
        print((str(i)+" ")*K)

else:
    KUP=((K+1)//2+3)//4*4
    print(KUP)

    ANS=[[0]*KUP for i in range(KUP)]

    begin=0
    for i in range(KUP):
        for j in range(KUP):
            if i%2==0:
                ANS[i][(j+begin)%KUP]=j+1
            else:
                ANS[i][(j+begin)%KUP]=j+1+KUP
                
        begin+=1

    for i in range(KUP*2-K):

        for j in range(KUP):
            for l in range(KUP):
                if ANS[j][l]==KUP*2-i:
                    ANS[j][l]=KUP*2-i-KUP

    for ans in ANS:
        print(*ans)