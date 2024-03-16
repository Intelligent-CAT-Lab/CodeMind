import sys

def main():
    K = int(sys.stdin.readline())
    X = int(sys.stdin.readline())

    if X <= 500*K:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()