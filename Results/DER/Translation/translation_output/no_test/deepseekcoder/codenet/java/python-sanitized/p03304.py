import sys

def main():
    n = int(sys.stdin.readline().strip())
    m = int(sys.stdin.readline().strip())
    d = int(sys.stdin.readline().strip())

    s = d if d == 0 else (n - d) * 2
    print(float(s)/n/n*(m-1))

if __name__ == "__main__":
    main()