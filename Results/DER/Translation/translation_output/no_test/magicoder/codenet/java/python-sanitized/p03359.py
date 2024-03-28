import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    if b >= a:
        print(a)
    else:
        print(a-1)

if __name__ == "__main__":
    main()