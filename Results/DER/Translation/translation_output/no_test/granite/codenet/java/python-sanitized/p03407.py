import sys

def main():
    a, b, c = map(int, sys.stdin.read().split())
    if a + b >= c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()