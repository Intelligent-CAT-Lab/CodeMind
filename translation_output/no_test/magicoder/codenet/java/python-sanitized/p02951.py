import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    if b + c < a:
        print(0)
    else:
        print(b + c - a)

if __name__ == "__main__":
    main()