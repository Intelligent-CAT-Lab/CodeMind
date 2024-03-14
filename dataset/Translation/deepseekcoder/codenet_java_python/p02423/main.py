import sys

def to32(s):
    a = 32 - len(s)
    if a != 0:
        for i in range(a):
            s = '0' + s
    if a < 0:
        s = s[-32:]
    return s

def main():
    x = int(sys.stdin.readline())
    twobit = format(x, '032b')
    left = format(x<<1, '032b')
    right = format(x>>1, '032b')
    print(twobit)
    for i in range(32):
        if twobit[i] == '0':
            sys.stdout.write('1')
        else:
            sys.stdout.write('0')
    sys.stdout.write('\n')
    print(left + '\n' + right)

if __name__ == "__main__":
    main()