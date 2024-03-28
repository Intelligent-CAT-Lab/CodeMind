S = input()
S = S.replace("eraser", "-")
S = S.replace("erase", "-")
S = S.replace("dreamer", "-")
S = S.replace("dream", "-")
S = S.replace("-", "")
if len(S) == 0:
    print("YES")
else:
    print("NO")

# TLE
str = S.split()
i = 0
flag = False
while i < len(str):
    if S[i:i+5] != "dream" and S[i:i+5] != "erase":
        print("NO")
        flag = True
        break
    elif S[i:i+5] == "dream":
        try:
            if str[i+5:i+10] == "er":
                if i+10 < len(str):
                    if str[i+10] == "a":
                        i = i+5
                    else:
                        i = i+10
                else:
                    i = i+5
        except IndexError:
            i = i+5
    elif S[i:i+5] == "erase":
        try:
            if str[i+5] == "r":
                i = i+6
            else:
                i = i+5
        except IndexError:
            i = i+5
if not flag:
    print("YES")