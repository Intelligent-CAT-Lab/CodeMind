s = ("a") 
if len(s) < 3:
    print(False)

for i in range(len(s) - 2):
    if s[i] == s[i+1] or s[i+1] == s[i+2] or s[i] == s[i+2]:
        print(False)
print(True)