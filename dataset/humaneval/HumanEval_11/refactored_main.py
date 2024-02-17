a = '111000'
b = '101010'
def xor(i, j):
    if i == j:
        return '0'
    else:
        return '1'
print(''.join(xor(x, y) for x, y in zip(a, b)))