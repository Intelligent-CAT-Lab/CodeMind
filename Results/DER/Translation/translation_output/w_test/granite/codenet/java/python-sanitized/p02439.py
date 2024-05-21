import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    min_ab = min(a, b)
    max_ab = max(a, b)
    min_abc = min(min_ab, c)
    max_abc = max(max_ab, c)
    print(min_abc, max_abc)

if __name__ == "__main__":
    main()