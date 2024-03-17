import sys

def main():
    x, y = map(int, sys.stdin.readline().split())
    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    else:
        print("a > b")

if __name__ == "__main__":
    main()