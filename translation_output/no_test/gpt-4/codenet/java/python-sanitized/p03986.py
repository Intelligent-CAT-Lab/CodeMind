x = input()

c = 0
length = 0
for char in x:
    if char == 'T':
        c -= 1
    else:
        if c < 0:
            length -= c
            c = 1
        else:
            c += 1

length += abs(c)
print(length)