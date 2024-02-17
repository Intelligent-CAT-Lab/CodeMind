a,b,c = map(int,"1 1 10".split())
cnt = 0
if a %2 == 0:
    cnt += 1
if b %2 == 0:
    cnt += 1
if c %2 == 0:
    cnt += 1
if cnt >= 2:
    print('Tem')
else:
    print('Hom')
