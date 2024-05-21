import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if abs(a - b) <= 1:
        print("Brown")
    else:
        print("Alice")

if __name__ == "__main__":
    main()