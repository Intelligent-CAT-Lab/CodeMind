import sys

akihabara = "AKIHABARA"
kihbr = "KIHBR"
s = sys.stdin.readline().strip()

i = 0
j = 0
k = 0
for c in s:
    if j+1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j]!= c:
        j += 1
    if j >= len(akihabara) or akihabara[j]!= c:
        print("NO")
        exit()
    if c!= 'A':
        if c == kihbr[k]:
            k += 1
        else:
            print("NO")
            exit()
    j += 1
if k == len(kihbr):
    print("YES")
else:
    print("NO")