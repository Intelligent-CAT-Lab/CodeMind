import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())

    d = a // b
    r = a % b
    f = "%.5f" % (a / b)

    print(d, r, f)

if __name__ == "__main__":
    main()