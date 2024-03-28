S = input()
currentlength = 0
length = 0
for i in range(len(S)):
    if S[i] == 'A' or S[i] == 'C' or S[i] == 'G' or S[i] == 'T':
        currentlength += 1
    else:
        if currentlength > length:
            length = currentlength
        currentlength = 0
print(max(length, currentlength))