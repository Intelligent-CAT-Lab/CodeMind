def to32(s):
    a = 32 - len(s)
    if a != 0:
        for i in range(a):
            s = '0' + s
    if a < 0:
        s = s[-32:]
    return s

x = int(input())
twobit = format(x, '032b')
left = format(x << 1, '032b')
right = format(x >> 1, '032b')
print(twobit)
inverted = ''.join('1' if bit == '0' else '0' for bit in twobit)
print(inverted)
print(left, right, sep='\n')