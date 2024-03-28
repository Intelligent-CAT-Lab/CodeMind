import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    if a <= 8 and b <= 8:
        print("Yay!")
    else:
        print(":(")

if __name__ == "__main__":
    main()