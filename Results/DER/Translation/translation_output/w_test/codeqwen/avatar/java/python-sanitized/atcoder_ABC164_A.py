def main():
    Sheep, Wolve = map(int, input().split())

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()