import sys

def main():
    n = int(sys.stdin.readline())
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    print(n - a - b + c)

if __name__ == "__main__":
    main()