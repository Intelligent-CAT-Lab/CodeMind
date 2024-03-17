import sys

def main():
    s = sys.stdin.readline().strip()
    s = ''.join([c for c in s if c == 'A' or c == 'Z'])
    s = ''.join([c for i, c in enumerate(s) if i == 0 or s[i - 1] != c])
    if s[0] == 'Z':
        s = s[1:]
    if s[-1] == 'A':
        s = s[:-1]
    if len(s) == 0:
        print(-1)
    else:
        print(s)

if __name__ == '__main__':
    main()