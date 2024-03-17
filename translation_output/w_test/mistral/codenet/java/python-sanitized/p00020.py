import sys

def main():
    for s in sys.stdin:
        t = ""
        for c in s:
            if c >= 97 and c <= 123:
                t += chr((c - 32))
            else:
                t += c
        print(t)

if __name__ == "__main__":
    main()