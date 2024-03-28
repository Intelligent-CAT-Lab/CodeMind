import sys

mstr = "AADINNUY"
nstr = "AIZUNYAN"
t = "AAAAAAAA"

for line in sys.stdin:
    dstr = line.strip()
    if len(dstr) < 8:
        print(dstr)
        continue
    for i in range(len(dstr)-7):
        tt = dstr[i:i+8]
        if sorted(tt) == sorted(mstr):
            dstr = dstr.replace(tt, nstr)
            i += 7
    print(dstr)