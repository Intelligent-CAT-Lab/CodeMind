n=int("4")
m=2**n
for i in range(m):
    temp=[0 for i in range(n)]
    j=i
    count=0
    while j>0:
        if j%2==1:
            temp[count]=1
            #print(count,temp[count])
        j//=2
        count+=1
    temp2=[]
    for k in range(n):
        if temp[k]==1:
            temp2.append(k)
    print(i,end="")
    if i!=0:
        print(":",end=" " )
        print(*temp2)
    else:
        print(":")
