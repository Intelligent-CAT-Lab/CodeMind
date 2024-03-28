import sys

def main():
    s = sys.stdin.readline().strip()
    count = 0
    black = 0
    for c in s:
        if c == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == '__main__':
    main()