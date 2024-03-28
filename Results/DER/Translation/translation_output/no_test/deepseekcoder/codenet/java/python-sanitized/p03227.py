import sys

def main():
    a = sys.stdin.readline().strip()
    b = list(a)
    c = len(a)

    if c == 3:
        b[0], b[2] = b[2], b[0]

    print(''.join(b))

if __name__ == "__main__":
    main()