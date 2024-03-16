import sys

s = input()
if len(s) < 4:
    print("No")
    sys.exit()
s2 = s[:4]
if s2 == "YAKI":
    print("Yes")
else:
    print("No")