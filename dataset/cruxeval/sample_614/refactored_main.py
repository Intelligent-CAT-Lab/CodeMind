text = 'zjegiymjc'
substr = 'j'
occ = 2
n = 0
while True:
    i = text.rfind(substr)
    if i == -1:
        break
    elif n == occ:
        print(i)
        break
    else:
        n += 1
        text = text[:i]
else:
    print(-1)