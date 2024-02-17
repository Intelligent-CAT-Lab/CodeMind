from collections import defaultdict
w = "abaccaba"
d = defaultdict(int)
for key in w:
    d[key] += 1
for value in d.values():
    if value % 2 != 0:
        print('No')
        exit()
print('Yes')
