N=int(input())
s=[]
if N==0:
    print(0)
else:
    while N!=1:
        if N%2==0:
            s.append(0)
            N=-N//2
        else:
            s.append(1)
            N=(1-N)//2
    s.append(1)
    print(*reversed(s),sep='')