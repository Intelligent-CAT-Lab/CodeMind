n,p=map(int,input().split())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(p)
ans=1
for i in range(len(l)):
    if l[i][1]>=n:
        ans*=l[i][0]**(l[i][1]//n)
print(ans)
