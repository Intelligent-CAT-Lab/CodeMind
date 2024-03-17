s = input()
length = len(s)

cnt = 0
l = 0
r = length - 1
while l <= r:
    cl = s[l]
    cr = s[r]

    if cl == cr:
        l += 1
        r -= 1
    elif cl == 'x':
        cnt += 1
        l += 1
    else:
        cnt = -1
        break

print(cnt)