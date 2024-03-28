import sys

def main():
    x = int(sys.stdin.readline())
    twobit = bin(x)[2:]
    left = bin(x<<1)[2:]
    right = bin(x>>1)[2:]
    print(twobit)
    for i in range(32):
        if twobit[i] == '0':
            print('1', end='')
        else:
            print('0', end='')
    print()
    print(left + right)

if __name__ == '__main__':
    main()