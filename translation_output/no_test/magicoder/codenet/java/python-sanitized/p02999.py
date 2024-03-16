import sys

def main():
    a = int(sys.stdin.readline())  # input Integer
    b = int(sys.stdin.readline())  # input Integer
    # input String
    # a = sys.stdin.readline()
    if a < b:
        print(0)
    else:
        print(10)

if __name__ == "__main__":
    main()