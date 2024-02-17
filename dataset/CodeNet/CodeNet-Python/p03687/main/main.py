from collections import Counter

S = list(eval(input()))
C = Counter(S)

o = []

for a in list(C.keys()):
    j = 0
    m = 0
    for b in S:
        if a == b:
            j = 0
        else:
            j += 1
            m = max(m,j)
    o.append(m)

print((min(o)))