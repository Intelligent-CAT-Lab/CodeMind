S = input()
A = []
for i in range(len(S)):
    A.append( chr ((ord(S[i])-65-3) % 26 + 65))

for i in A:
    print(i,end="")
print("")