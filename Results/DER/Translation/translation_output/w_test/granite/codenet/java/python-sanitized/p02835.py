import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    if a + b + c >= 22:
        print("bust")
    else:
        print("win")

if __name__ == "__main__":
    main()