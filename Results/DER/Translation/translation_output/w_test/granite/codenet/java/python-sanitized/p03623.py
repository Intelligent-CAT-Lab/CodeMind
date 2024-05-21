import sys

def main():
    x, a, b = map(int, sys.stdin.readline().split())
    if abs(x - a) < abs(x - b):
        print("A")
    else:
        print("B")

if __name__ == "__main__":
    main()