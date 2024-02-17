s=input()
i=0
j=len(s)-1
ans=0
while i<j:
    while s[i]==s[j]=="x":
        i+=1
        j-=1
        if i>j:break
    if i>j:break    
    while s[i]=="x":
        i+=1
        ans+=1
        if i>j:break
    if i>j:break
    while s[j]=="x":
        j-=1
        ans+=1
        if i>j:break
    if i>j:break
    if s[i]!=s[j]:
        ans=-1
        break
    i+=1
    j-=1
    if i>j:break
print(ans)