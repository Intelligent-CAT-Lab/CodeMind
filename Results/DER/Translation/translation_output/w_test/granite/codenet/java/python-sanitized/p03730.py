import sys

def main():
    a, b, c = map(int, input().split())
    for i in range(5000):
        if a * i % b == c:
            print("YES")
            sys.exit(0)
    print("NO")

if __name__ == "__main__":
    main()