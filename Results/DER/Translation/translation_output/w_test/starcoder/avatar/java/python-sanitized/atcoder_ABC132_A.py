import sys

def main():
    input = sys.stdin.readline
    s = input().strip()
    chars = set(s.split(' '))
    if len(chars) == 2:
        print('Yes')
    else:
        print('No')

if __name__ == '__main__':
    main()