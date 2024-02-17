X=eval(input())
ans=0
memo=0
for i in range(len(X)):
    if X[i]=="T":
        if memo==0:pass
        else:memo-=1
    else:memo+=1
print((memo*2))