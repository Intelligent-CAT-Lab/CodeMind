strands = ['__', '1', '.', '0', 'r0', '__', 'a_j', '6', '__', '6']
subs = strands
for i, j in enumerate(subs):
    for _ in range(len(j) // 2):
        subs[i] = subs[i][-1:] + subs[i][1:-1] + subs[i][0]
print(''.join(subs))