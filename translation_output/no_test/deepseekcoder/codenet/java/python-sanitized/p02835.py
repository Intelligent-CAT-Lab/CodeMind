import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    c = int(sys.stdin.readline().strip())
    if a + b + c >= 22:
        print("bust")
    else:
        print("win")

if __name__ == "__main__":
    main()