import sys

def main():
    scList = sys.stdin.readline().split()
    Sheep = int(scList[0])
    Wolve = int(scList[1])

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()