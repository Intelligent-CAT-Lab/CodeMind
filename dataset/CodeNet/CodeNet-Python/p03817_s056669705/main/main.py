x = int(eval(input()))

s = x//11

cnt = s*2

x -= s*11

if x == 0:
    pass
elif x <= 6:
    cnt += 1
elif x < 11:
    cnt += 2
else:
    print('error')

print(cnt)