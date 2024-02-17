s=eval(input())
i=1
new=[s[0]]
while i<len(s):
    if s[i]=="C" and s[i-1] == "B":
        new.pop()
        new.append("K")
    else:
        new.append(s[i])
    i+=1

cnt=0
ans=0
for i in range(len(new)-1,-1,-1):
    if new[i]=="A" and cnt > 0:
        ans+=cnt
    elif new[i]=="K":
        cnt+=1
    else:
        cnt=0
    
print(ans)