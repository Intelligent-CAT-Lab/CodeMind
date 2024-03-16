import sys

def main():
    in_str = sys.stdin.readline()
    a, b, c = map(int, in_str.split())

    if a < b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()