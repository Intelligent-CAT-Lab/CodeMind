import re
s=re.split("B|C",input().replace("BC","D"))
c,cd=0,0
for i in s:
    for j in range(len(i)):
        if i[j]=="D":
            c+=j-cd
            cd+=1
    cd=0
print(c)