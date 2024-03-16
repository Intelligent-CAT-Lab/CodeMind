import sys

def main():
    scanner = sys.stdin
    scanner.readline()
    a, b, c = map(str, scanner.readline().split(","))
    print(a + " " + b + " " + c)

if __name__ == "__main__":
    main()