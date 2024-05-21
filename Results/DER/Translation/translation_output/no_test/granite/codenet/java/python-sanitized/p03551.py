import sys

def main():
    n = int(input())
    m = int(input())

    base = n*100+m*1800
    print(base << m)

if __name__ == "__main__":
    sys.exit(main())