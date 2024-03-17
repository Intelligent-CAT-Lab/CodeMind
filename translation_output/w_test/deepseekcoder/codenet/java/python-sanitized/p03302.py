import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a + b == 15:
        print("+")
    elif a * b == 15:
        print("*")
    else:
        print("x")

if __name__ == "__main__":
    main()