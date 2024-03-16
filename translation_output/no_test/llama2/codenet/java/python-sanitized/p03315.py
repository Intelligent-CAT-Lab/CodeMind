import sys


def main():
    s = sys.stdin.readline()
    ary = s.strip().split('')
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)


if __name__ == '__main__':
    main()