import sys

def main():
    n, m, d = map(int, sys.stdin.readline().split())

    s = d if d == 0 else (n - d) * 2
    result = (s/n/n*(m-1))
    print(result)

if __name__ == "__main__":
    main()