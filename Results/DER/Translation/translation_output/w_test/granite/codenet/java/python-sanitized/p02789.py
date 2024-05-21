import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    if n == m:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()