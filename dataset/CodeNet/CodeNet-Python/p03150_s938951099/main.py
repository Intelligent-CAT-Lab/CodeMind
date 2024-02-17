S = input()
length = len(S)

for i in range(length):
    for j in range(i, length):
        if S[:i] + S[j:] == "keyence":
            print("YES")
            exit(0)
print("NO")