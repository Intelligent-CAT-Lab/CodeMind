s = input()
s = sorted(s)
if s[0]==s[1] and s[2]==s[3] and s[1]!=s[2]:
    print("Yes")
else:
    print("No")