import sys

def main():
    with open(sys.stdin, 'r') as f:
        while True:
            s = f.readline()
            if s is None:
                break
            t = ""
            for i, c in enumerate(s):
                t += chr(((ord(c) >= 97 and ord(c) <= 123) ? (ord(c) - 32) : ord(c)))
            print(t)

if __name__ == "__main__":
    main()