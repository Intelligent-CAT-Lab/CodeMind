import sys

def main():
    s = sys.stdin.readline().strip()
    s = s.replace('AZ', '')
    s = s.replace('ZA', '')
    s = s.replace('AZ', '')
    s = s.replace('ZA', '')
    if s == '':
        print(-1)
    else:
        print(s)

if __name__ == '__main__':
    main()