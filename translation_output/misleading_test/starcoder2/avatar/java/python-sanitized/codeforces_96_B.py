number = int(input())
ans = -1
value = 0
mask = 2

while value < number:
    s = bin(mask)[2:]
    zeros = 0
    for c in s:
        if c == '0':
            zeros += 1
    if zeros != len(s) - zeros:
        mask += 1
        continue
    s = s.replace('0', '4')
    s = s.replace('1', '7')
    value = int(s)
    mask += 1

print(value)