mod=11
n,k=map(int,raw_input().split())
k=(k-8)%mod
last=7*n-7*2-2
idx=-1
for i in xrange(1,last+1):
    if 3*(i+i+1+i+2)%mod==k:
        idx=i
        break
r2idx=r1idx=-1
for i in xrange(1,n+1):
    if (7*i-1-idx)%11==0:
        r2idx=7*i-1
        break
for i in xrange(1,n+1):
    if (7*i-idx)%11==0:
        r1idx=7*i
        break
if idx==-1:
    print(0)
    exit()
if r1idx==-1:
    if r2idx==-1:
        print((last-idx)/11+1)
    else:
        print((last-idx)/11+1-(last-r2idx)/(7*11)-1)
else:
    if r2idx==-1:
        print((last-idx)/11+1-(last-r1idx)/(7*11)-1)
    else:
        print((last-idx)/11+1-(last-r2idx)/(7*11)-1-(last-r1idx)/(7*11)-1)

#print r1idx,r2idx,idx
#print((last-idx)/11+1-(last-r2idx)/(n*11)-1-(last-r1idx)/(n*11)-1)
