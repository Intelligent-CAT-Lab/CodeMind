import sys

def main():
    a = int(sys.stdin.readline().strip())  # input Integer
    b = int(sys.stdin.readline().strip())  # input Integer
    # a = sys.stdin.readline().strip()  # input String
    if a < b:
        print(0)
    else:
        print(10)

if __name__ == "__main__":
    main()