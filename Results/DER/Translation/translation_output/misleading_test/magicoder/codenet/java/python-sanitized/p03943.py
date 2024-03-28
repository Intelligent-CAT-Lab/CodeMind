import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())

    if a + b == c or a + c == b or b + c == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()