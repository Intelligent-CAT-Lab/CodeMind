import sys

def main():
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    if A - (B * 2) > 0:
        print(A - (B * 2))

if __name__ == "__main__":
    main()