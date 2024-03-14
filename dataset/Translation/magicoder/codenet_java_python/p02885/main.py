import sys

def main():
    line = sys.stdin.readline().strip()
    a, b = map(int, line.split())
    if a > 2 * b:
        print(a - 2 * b)
    else:
        print(0)

if __name__ == "__main__":
    main()