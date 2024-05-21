import sys

if __name__ == "__main__":
    x = int(sys.stdin.read())
    print("ABC" if x < 1200 else "ARC")