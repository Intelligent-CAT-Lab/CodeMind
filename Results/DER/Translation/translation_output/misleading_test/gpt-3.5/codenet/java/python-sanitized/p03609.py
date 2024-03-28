def main():
    x, t = map(int, input().split())
    if x > t:
        print(x - t)
    else:
        print(0)

if __name__ == "__main__":
    main()