import sys

def main():
    for s in sys.stdin:
        t = ""
        for c in s:
            t += chr(((ord(c) >= 97 and ord(c) <= 123) ? (ord(c) - 32) : ord(c)))
        print(t)

if __name__ == "__main__":
    main()