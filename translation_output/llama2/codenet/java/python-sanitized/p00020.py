import sys

def main():
    s = sys.stdin.readline()
    t = ""
    for i in range(len(s)):
        c = s[i]
        if c >= 97 and c <= 123:
            t += chr(ord(c) - 32)
        else:
            t += c
    print(t)

if __name__ == "__main__":
    main()