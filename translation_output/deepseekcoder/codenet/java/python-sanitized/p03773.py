import sys

def main():
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())

    ans = (A + B) % 24
    print(ans)

if __name__ == "__main__":
    main()