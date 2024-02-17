s = input()
x,ans = len(s),"Yes"
if x%2==1: ans = "No"
else:
  for i in range(x//2):
    if s[i]=="b" and s[x-i-1]!="d": ans = "No"
    elif s[i]=="d" and s[x-i-1]!="b": ans = "No"
    elif s[i]=="p" and s[x-i-1]!="q": ans = "No"
    elif s[i]=="q" and s[x-i-1]!="p": ans = "No"
print(ans)