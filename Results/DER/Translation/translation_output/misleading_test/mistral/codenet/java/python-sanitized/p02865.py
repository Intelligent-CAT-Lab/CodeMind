import sys

def read_line():
    line = input().strip().split()
    return line

def main():
    N = int(read_line())
    print((N - 1) // 2)

if __name__ == "__main__":
    main()