def to32(s):
    if len(s) < 32:
        s = '0' * (32 - len(s)) + s
    elif len(s) > 32:
        s = s[-32:]
    return s

def main():
    x = int(input())
    twobit = format(x, 'b')
    left = format(x << 1, 'b')
    right = format(x >> 1, 'b')
    twobit = to32(twobit)
    left = to32(left)
    right = to32(right)
    print(twobit)
    print(''.join('1' if bit == '0' else '0' for bit in twobit))
    print(left)
    print(right)

if __name__ == "__main__":
    main()