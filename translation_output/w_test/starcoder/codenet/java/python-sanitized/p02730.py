s = input()

for i in range(len(s)//2):
    if s[i]!=s[-1-i]:
        print("No")
        break
else:
    for i in range(len(s)//2-1):
        if s[i]!=s[-1-i]:
            print("No")
            break
    else:
        print("Yes")