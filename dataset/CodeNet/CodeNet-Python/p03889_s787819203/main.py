s = list(input())
sr = list(reversed(s))
t = len(s)//2
for i in range(t+1):
    if not (s[i] == "b" and sr[i] == "d" or s[i] == "d" and sr[i] == "b" or s[i] == "p" and sr[i] == "q" or s[i] == "q" and sr[i] == "p"):
        print("No")
        break
else:
    print("Yes")
