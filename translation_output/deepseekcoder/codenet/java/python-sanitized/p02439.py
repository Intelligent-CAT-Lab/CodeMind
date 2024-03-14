import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    min_val = min(a, b)
    max_val = max(a, b)
    print(min(min_val, c), max(max_val, c))

if __name__ == "__main__":
    main()