import sys

def main():
    sc = sys.stdin
    count = 0
    s = sc.readline()

    i = 0
    black = 0
    for i in range(len(s)):
        if s[i] == 'W':
            count += black
        else:
            black += 1

    print(count)

if __name__ == "__main__":
    main()