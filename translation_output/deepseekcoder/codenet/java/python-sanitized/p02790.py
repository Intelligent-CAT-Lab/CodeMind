import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())

    if a >= b:
        for i in range(a):
            print(b, end="")
    else:
        for i in range(b):
            print(a, end="")

if __name__ == "__main__":
    main()