import sys

def main():
    n = int(sys.stdin.readline())
    m = int(sys.stdin.readline())
    d = int(sys.stdin.readline())

    s = d if d == 0 else (n - d) * 2
    print(float(s)/n/n*(m-1))

if __name__ == "__main__":
    main()