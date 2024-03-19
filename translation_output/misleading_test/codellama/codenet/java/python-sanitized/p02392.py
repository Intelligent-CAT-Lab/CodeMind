import sys

def main():
    inStr = sys.stdin.readline().strip()
    in = inStr.split(" ")
    a, b, c = map(int, in)
    if a < b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()