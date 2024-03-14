import sys

def main():
    s = sys.stdin.readline().strip()
    c = s[0]
    print(chr(ord(c) + 1))

if __name__ == "__main__":
    main()