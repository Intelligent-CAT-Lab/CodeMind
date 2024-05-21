import sys

def main():
    s, t = sys.stdin.read().split()
    n = int(s + t)
    b = int(n ** 0.5)
    print("Yes" if b * b == n else "No")

if __name__ == "__main__":
    main()