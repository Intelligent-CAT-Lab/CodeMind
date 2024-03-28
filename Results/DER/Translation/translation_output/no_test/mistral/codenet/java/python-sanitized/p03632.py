import sys

def main():
    for line in sys.stdin:
        numbers = list(map(int, line.split()))
        a, b, c, d = numbers
        start = max(a, c)
        end = min(b, d)
        print(end - start if end - start > 0 else 0)

if __name__ == "__main__":
    main()