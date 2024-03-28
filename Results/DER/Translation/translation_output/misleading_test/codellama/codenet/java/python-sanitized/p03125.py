import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(b % a == 0 and a + b or b - a)

if __name__ == "__main__":
    main()