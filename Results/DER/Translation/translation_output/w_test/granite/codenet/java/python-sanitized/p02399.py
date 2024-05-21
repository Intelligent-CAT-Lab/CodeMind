import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    d = a // b
    r = a % b
    f = "{:.5f}".format(a / b)
    print(d, r, f)

if __name__ == "__main__":
    main()