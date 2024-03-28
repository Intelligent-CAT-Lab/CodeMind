import sys

def main():
    line = sys.stdin.readline().split()
    x, y = int(line[0]), int(line[1])

    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    elif x > y:
        print("a > b")

if __name__ == "__main__":
    main()