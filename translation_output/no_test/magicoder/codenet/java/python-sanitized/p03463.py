import sys

def main():
    n = int(sys.stdin.readline())
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())

    k = b - a
    if k % 2 == 1:
        print("Borys")
    else:
        print("Alice")

if __name__ == "__main__":
    main()