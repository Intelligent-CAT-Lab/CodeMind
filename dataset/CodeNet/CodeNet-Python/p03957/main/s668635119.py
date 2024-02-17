s = eval(input())
ss = ""
p = 0
for i in range(len(s)):
    if p == 0 and s[i] == "C":
        p = 1
    elif p == 1 and s[i] == "F":
        p = 2
print(("Yes" if p == 2 else "No"))