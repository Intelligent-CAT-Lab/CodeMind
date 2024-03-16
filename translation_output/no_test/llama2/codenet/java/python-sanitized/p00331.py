import sys

def main():
    H, R = map(int, sys.stdin.readline().split())
    if abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)

if __name__ == '__main__':
    main()