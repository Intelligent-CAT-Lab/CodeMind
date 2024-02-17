S="RUDLUDR"
a=0
for i in range(len(S)):
    if i%2==0:
        if S[i]=='L':
            a+=1
    elif i%2==1:
        if S[i]=='R':
            a+=1
if a==0:
    print('Yes')
else:
    print('No')