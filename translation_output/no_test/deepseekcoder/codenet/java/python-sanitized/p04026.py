import sys

def main():
    s = input()
    last = [-1]*26
    for i, ch in enumerate(s):
        ch = ord(ch) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            print(last[ch], i)
            sys.exit(0)
        last[ch] = i
    print(-1, -1)

if __name__ == "__main__":
    main()