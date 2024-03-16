import sys

def main():
    X = int(sys.stdin.readline())
    Y = int(sys.stdin.readline())
    if X % 2 == 0 or Y % 2 == 0:
        print("Even")
        return
    print("Odd")

if __name__ == "__main__":
    main()