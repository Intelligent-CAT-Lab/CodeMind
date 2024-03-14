import sys

def main():
    r = int(sys.stdin.readline())
    if r < 1200:
        print("ABC")
    elif r < 2800:
        print("ARC")
    else:
        print("AGC")

if __name__ == "__main__":
    main()