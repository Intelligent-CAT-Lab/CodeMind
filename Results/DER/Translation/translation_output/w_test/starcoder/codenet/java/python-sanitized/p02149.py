import sys

def main():
    a = [int(x) for x in sys.stdin.readline().split()]
    print(chr(ord('A') + a.index(max(a))))

if __name__ == '__main__':
    main()