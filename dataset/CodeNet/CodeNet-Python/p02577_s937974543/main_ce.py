n = list("123456789")
ans=0
for i in range(len(n)):
    ans+=int(n[i])
if ans%9==0:
    print('Yes')
else:
    print('No')