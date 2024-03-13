import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())

    for i in range(5000):
        if a * i % b == c:
            print("YES")
            return
    print("NO")

if __name__ == "__main__":
    main()