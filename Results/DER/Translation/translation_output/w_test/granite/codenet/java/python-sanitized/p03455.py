import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    if X % 2 == 0 or Y % 2 == 0:
        print("Even")
    else:
        print("Odd")

if __name__ == "__main__":
    main()