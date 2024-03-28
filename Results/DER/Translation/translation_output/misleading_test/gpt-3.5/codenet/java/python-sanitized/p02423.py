def to32(s):
    a = 32 - len(s)
    if a != 0:
        s = '0' * a + s
    if a < 0:
        s = s[-32:]
    return s

x = int(input())
twobit = bin(x)[2:]
left = bin(x << 1)[2:]
right = bin(x >> 1)[2:]

twobit = to32(twobit)
left = to32(left)
right = to32(right)

print(twobit)
for i in range(32):
    if twobit[i] == '0':
        print('1', end='')
    else:
        print('0', end='')
print()

print(left)
print(right)