import sys

def main():
    x = sys.stdin.readline()
    c = 0
    len = 0
    for i in range(len(x)):
        if x[i] == 'T':
            c -= 1
        else:
            if c < 0:
                len -= c
                c = 1
            else:
                c += 1
    len += abs(c)
    print(len)

if __name__ == '__main__':
    main()