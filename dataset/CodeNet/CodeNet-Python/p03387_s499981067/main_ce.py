A,B,C=map(int, "2 5 4".split())
odd=[]
even=[]
for x in [A,B,C]:
    if x%2==0:
        even.append(x)
    else:
        odd.append(x)
cnt = 0
ns = []
if len(even) == 2:
    for x in even:
        cnt = 1
        ns.append(x+1)
else:
    ns.extend(even)
if len(odd) == 2:
    for x in odd:
        cnt = 1
        ns.append(x+1)
else:
    ns.extend(odd)
ns.sort()
max_v = max(ns)
for x in ns:
    cnt += (max_v-x) // 2
print(cnt)