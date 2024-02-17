S = input()

max0 = 0
max1 = 0
amax0 = []
amax1 = []
mi0 = 0
mi1 = 0
h0 = 0
h1 = 0
for i, c in enumerate(S):
    if c=="1":
        h1 += 1
        if h1-mi1 > max1:
            max1 = h1-mi1
            amax1 = [i]
        elif h1-mi1 == max1:
            amax1.append(i)
        h0 -= 1
        if h0 < mi0:
            mi0 = h0
    elif c=="0":
        h1 -= 1
        if h1 < mi1:
            mi1 = h1
        h0 += 1
        if h0-mi0 > max0:
            max0 = h0-mi0
            amax0 = [i]
        elif h0-mi0 == max0:
            amax0.append(i)
    else:
        h1 -= 1
        if h1 < mi1:
            mi1 = h1
        h0 -= 1
        if h0 < mi0:
            mi0 = h0
if max0 < max1:
    if len(set([i%2 for i in amax1]))==1:
        print(max1)
    else:
        print(max1+1)
elif max0 > max1:
    if len(set([i%2 for i in amax0]))==1:
        print(max0)
    else:
        print(max0+1)
else:
    if len(set([i%2 for i in amax1]+[(max0+i)%2 for i in amax0]))==1:
        print(max0)
    else:
        print(max0+1)
