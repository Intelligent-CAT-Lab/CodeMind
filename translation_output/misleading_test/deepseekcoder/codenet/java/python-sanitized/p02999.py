import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a < b:
        print(0)
    else:
        print(10)

if __name__ == "__main__":
    main()