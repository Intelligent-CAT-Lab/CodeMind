def to32(s):
    a = 32 - len(s)
    if a != 0:
        s = '0' * a + s
    if a < 0:
        s = s[-32:]
    return s

x = int(input())
twobit = format(x, '032b')
left = format(x << 1, '032b')
right = format(x >> 1, '032b')
print(twobit)
for i in range(32):
    if twobit[i] == '0':
        print('1', end='')
    else:
        print('0', end='')
print()
print(left)
print(right)