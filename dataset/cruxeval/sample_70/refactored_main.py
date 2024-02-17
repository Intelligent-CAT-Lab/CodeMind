x = '999893767522480'
a = 0
for i in x.split(' '):
    a += len(i.zfill(len(i)*2))
print(a)