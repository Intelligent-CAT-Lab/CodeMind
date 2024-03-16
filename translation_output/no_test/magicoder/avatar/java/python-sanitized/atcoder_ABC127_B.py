import sys

def main():
    r = int(sys.stdin.readline())
    d = int(sys.stdin.readline())
    x = int(sys.stdin.readline())

    for _ in range(10):
        x = r * x - d
        print(x)

if __name__ == "__main__":
    main()