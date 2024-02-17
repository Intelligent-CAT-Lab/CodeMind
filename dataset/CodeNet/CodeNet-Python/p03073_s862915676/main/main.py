S = str(eval(input()))
slist = []
for i in range(len(S)):
    slist.append(S[i])
ans = 0

for i in range(len(slist)-1):
    if slist[i]==slist[i+1] and slist[i+1]=='0':
        slist[i+1] = '1'
        ans += 1
    elif slist[i]==slist[i+1] and slist[i+1]=='1':
        slist[i+1] = '0'
        ans += 1
    else:
        pass
print(ans)