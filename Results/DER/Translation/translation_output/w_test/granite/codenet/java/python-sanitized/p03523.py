import sys

AKIHABARA = "AKIHABARA"
KIHBR = "KIHBR"

s = sys.stdin.readline().strip()

i = 0
j = 0
k = 0
for c in s:
    if j+1 < len(AKIHABARA) and AKIHABARA[j] == 'A' and AKIHABARA[j]!= c:
        j += 1
    if j >= len(AKIHABARA) or AKIHABARA[j]!= c:
        print("NO")
        sys.exit(0)
    if c!= 'A':
        if c == KIHBR[k]:
            k += 1
        else:
            print("NO")
            sys.exit(0)
    j += 1
if k == len(KIHBR):
    print("YES")
else:
    print("NO")