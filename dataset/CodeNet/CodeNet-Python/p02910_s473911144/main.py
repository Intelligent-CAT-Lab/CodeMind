s = input()
flag = True
for i, j in enumerate(s):
    if ( i+1) % 2 == 0:
        if not(j == "L" or j =="U" or j == "D"):
            flag = False
    else:
        if not(j == "R" or j =="U" or  j == "D"):
            flag = False
if flag:
    print("Yes")
else:
    print("No")