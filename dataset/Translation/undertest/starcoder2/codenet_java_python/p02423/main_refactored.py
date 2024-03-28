class main:
    x = int(input())
    twobit = bin(x)
    left = bin(x<<1)
    right = bin(x>>1)
    twobit = twobit.replace('0b','')
    left = left.replace('0b','')
    right = right.replace('0b','')
    twobit = twobit.zfill(32)
    left = left.zfill(32)
    right = right.zfill(32)
    print(twobit)
    for i in range(32):
        if twobit[i] == '0':
            print('1',end='')
        else:
            print('0',end='')
    print()
    print(left)
    print(right)