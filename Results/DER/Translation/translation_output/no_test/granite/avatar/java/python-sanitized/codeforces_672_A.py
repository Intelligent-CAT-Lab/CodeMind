import sys

def main():
    n = int(input())
    s = " ".join(str(i) for i in range(1, n + 1))
    print(s.split()[n - 1])

if __name__ == "__main__":
    sys.exit(main())