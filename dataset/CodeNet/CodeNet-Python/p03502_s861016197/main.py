n=input()
_sum=0
for i in range(len(n)):
    _sum+=int(n[i])
print('Yes') if int(n)%_sum==0 else print('No')