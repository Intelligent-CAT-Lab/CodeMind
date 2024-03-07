import sys

def main():
    sc = sys.stdin.readline().strip()
    ary = list(sc)
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)

if __name__ == '__main__':
    main()