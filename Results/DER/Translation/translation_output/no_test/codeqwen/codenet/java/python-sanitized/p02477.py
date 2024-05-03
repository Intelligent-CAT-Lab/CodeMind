import sys

def main():
    str = sys.stdin.readline().strip()
    A = int(str)
    str = sys.stdin.readline().strip()
    B = int(str)
    print(A * B)

if __name__ == "__main__":
    main()