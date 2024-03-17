import sys

def main():
    try:
        x, y = map(int, sys.stdin.readline().split())
    except ValueError:
        print("Invalid input")
        return

    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    else:
        print("a > b")

if __name__ == "__main__":
    main()