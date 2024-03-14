import sys

def main():
    count = 0
    s = sys.stdin.readline().strip()
    black = 0
    for ch in s:
        if ch == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == "__main__":
    main()