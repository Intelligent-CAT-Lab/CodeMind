import sys

def main():
    input = sys.stdin.readline
    k = int(input()) - 1
    b = int(input()) - 1
    print(k * b)

if __name__ == '__main__':
    main()