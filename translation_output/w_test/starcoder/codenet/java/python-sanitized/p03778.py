import sys

def main():
    w, a, b = map(int, sys.stdin.readline().split())
    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    elif a + w <= b:
        print(b - a - w)
    else:
        print(a - b - w)

if __name__ == '__main__':
    main()