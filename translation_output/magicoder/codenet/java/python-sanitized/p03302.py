import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    if a + b == 15:
        print("+")
    elif a * b == 15:
        print("*")
    else:
        print("x")

if __name__ == "__main__":
    main()