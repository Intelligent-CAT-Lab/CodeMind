def coun(n,r):
    return n*r+1+r-r**2

def sigma(func,frm,too):
    result=0
    for i in range(frm,too+2):
        #print(i)
        result=result+func(too,i)
        #print(result)
    print(result%mod)

n,k=list(map(int,input().split()))
mod=10**9+7

sigma(coun,k,n)