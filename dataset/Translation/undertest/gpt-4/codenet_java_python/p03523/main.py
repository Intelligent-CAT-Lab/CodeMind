# Read input string from user
s = input()

akihabara = "AKIHABARA"
kihbr = "KIHBR"
j = 0
k = 0

for i in range(len(s)):
    if j + 1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
        j += 1

    if j >= len(akihabara) or akihabara[j] != s[i]:
        print("NO")
        break

    if s[i] != 'A':
        if k < len(kihbr) and s[i] == kihbr[k]:
            k += 1
        else:
            print("NO")
            break
            
    j += 1
else:  # Note: