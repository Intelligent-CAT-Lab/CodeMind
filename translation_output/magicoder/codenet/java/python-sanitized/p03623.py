import sys

def main():
    x = int(sys.stdin.readline())
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    if abs(x-a) < abs(x-b):
        print("A")
    else:
        print("B")

if __name__ == "__main__":
    main()