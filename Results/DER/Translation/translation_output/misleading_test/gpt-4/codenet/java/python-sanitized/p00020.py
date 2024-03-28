import sys

def main():
    for line in sys.stdin:
        t = ""
        for c in line.strip():
            if ord('a') <= ord(c) <= ord('z'):
                t += chr(ord(c) - 32)
            else:
                t += c
        print(t)

if __name__ == '__main__':
    main()