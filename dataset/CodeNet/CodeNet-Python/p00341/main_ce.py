a=[0]*100
b=list(map(int,"1 1 3 4 8 9 7 3 4 5 5 5".split()))
for i in range(12):
    a[b[i]-1]+=1
c=0
for i in range(100):
    if a[i] and a[i]%4==0: c+=a[i]//4
print('yes' if c==3 else 'no')