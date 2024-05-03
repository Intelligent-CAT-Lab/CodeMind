def main():
    scList = input().split()
    Sheep, Wolve = map(int, scList)

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()