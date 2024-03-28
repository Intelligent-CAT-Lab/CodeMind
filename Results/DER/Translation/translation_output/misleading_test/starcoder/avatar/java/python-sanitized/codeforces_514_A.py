import sys

def main():
    x = int(sys.stdin.readline())
    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x / 10 == 0 and 9 - r == 0:
                print(r)
            else:
                print(9 - r)
        else:
            print(r)
        x = x / 10

if __name__ == '__main__':
    main()