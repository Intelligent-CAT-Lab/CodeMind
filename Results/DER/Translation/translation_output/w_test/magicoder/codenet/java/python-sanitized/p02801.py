import sys

def next_char(c):
    return chr(ord(c) + 1)

def main():
    s = sys.stdin.readline().strip()
    c = s[0]
    out = next_char(c)
    print(out)

if __name__ == "__main__":
    main()