import sys

def main():
    line = sys.stdin.readline().rstrip()
    Sheep, Wolve = map(int, line.split())

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()