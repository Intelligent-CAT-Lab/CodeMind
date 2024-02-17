a,b,c = list(map(int,input().split()))

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
