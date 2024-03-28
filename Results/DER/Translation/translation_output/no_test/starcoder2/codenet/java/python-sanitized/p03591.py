s = input()
if len(s) < 4:
    print("No")
else:
    s2 = s[0:4]
    if s2 == "YAKI":
        print("Yes")
    else:
        print("No")