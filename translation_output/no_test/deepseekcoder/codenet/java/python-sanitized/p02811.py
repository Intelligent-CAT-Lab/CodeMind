import sys

def main():
    K = int(sys.stdin.readline().strip())
    X = int(sys.stdin.readline().strip())

    if X <= 500*K:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()