import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())

    d = a//b
    r = a%b
    f = "{:.5f}".format(a / b)

    print(d, r, f)

if __name__ == "__main__":
    main()