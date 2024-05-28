s = "python"
n = len(s)
for i in range(1,n) :
    if s[i] != s[0] :
        print(False)
        break
else:
    print(True)