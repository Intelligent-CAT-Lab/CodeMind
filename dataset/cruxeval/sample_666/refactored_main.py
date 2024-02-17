d1 = { 0: [], 1: [] }
d2 = { 0: [0, 0, 0, 0], 2: [2, 2, 2] }
mmax = 0
for k1 in d1:
    if p := len(d1[k1])+len(d2.get(k1, [])):
        if p > mmax:
            mmax = p
print(mmax)