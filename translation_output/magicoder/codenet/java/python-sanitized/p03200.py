import sys

def main():
    count = 0
    s = sys.stdin.readline().strip()

    i = 0
    black = 0
    for c in s:
        if c == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == "__main__":
    main()