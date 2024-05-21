import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    if a > b or (n == 1 and a!= b):
        print(0)
        return
    if a == b:
        print(1)
        return
    print((n - 2) * (b - a) + 1)

if __name__ == "__main__":
    main()