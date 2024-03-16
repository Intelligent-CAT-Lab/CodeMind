import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    if a + b >= 10:
        print("error")
    else:
        print(a + b)

if __name__ == "__main__":
    main()