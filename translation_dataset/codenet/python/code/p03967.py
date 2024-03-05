s=input()
ret=0
for i in range(len(s)):
    ret+=(i%2)-[0,1][int(s[i]=="p")]
print(ret)