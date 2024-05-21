import sys

def main():
    N = int(sys.stdin.readline())
    x, y = divmod(N - 1, 26)
    out = []
    while x > 0:
        out.append(chr(ord('a') + y))
        x, y = divmod(x - 1, 26)
    out.append(chr(ord('a') + y))
    print(''.join(reversed(out)))

if __name__ == '__main__':
    main()