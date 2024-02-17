L=int(input())
s=bin(L)[2:]
l=len(s)-1
ans=[]
for i in range(l):
    ans.append([i+1,i+2,2**(l-i-1)])
    ans.append([i+1,i+2,0])
u=2**(l)
for k in range(1,l+1):
    if s[k]!='0':
        ans.append([1,k+1,u])
        u+=2**(l-k) 
        #print(k+1,l)
print(l+1,len(ans))
for a,b,c in ans:
    print(a,b,c)