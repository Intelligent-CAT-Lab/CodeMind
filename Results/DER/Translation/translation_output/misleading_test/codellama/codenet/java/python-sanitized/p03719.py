import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    if a <= c <= b:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()