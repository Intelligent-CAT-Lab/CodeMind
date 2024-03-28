import sys

def main():
    s = sys.stdin.readline().strip()
    s = s.replace('A', '')
    s = s.replace('Z', '')
    s = s.replace('a', '')
    s = s.replace('z', '')
    if len(s) == 0:
        print(-1)
    else:
        print(s)

if __name__ == '__main__':
    main()