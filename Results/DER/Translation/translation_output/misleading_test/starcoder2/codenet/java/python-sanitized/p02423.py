x = int(input())
twobit = bin(x)
left = bin(x<<1)
right = bin(x>>1)
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

def to32(s):
    a = 32 - len(s)
    if a != 0:
        for i in range(a):
            s = '0' + s
    if a < 0:
        s = s[len(s)-32:]
    return s

/p02423.py
x = int(input())
twobit = bin(x)
left = bin(x<<1)
right = bin(x>>1)
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

def to32(s):
    a = 32 - len(s)
    if a != 0:
        for i in range(a):
            s = '0' + s
    if a < 0:
        s = s[len(s)-32:]
    return s