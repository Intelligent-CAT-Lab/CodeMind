import sys

def main():
    s = sys.stdin.readline()
    black = 0
    count = 0
    for i in range(len(s)):
        if s[i] == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == '__main__':
    main()