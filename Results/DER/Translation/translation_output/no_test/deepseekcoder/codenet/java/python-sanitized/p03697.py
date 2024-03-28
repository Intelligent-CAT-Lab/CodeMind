import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    if a + b >= 10:
        print("error")
    else:
        print(a + b)

if __name__ == "__main__":
    main()