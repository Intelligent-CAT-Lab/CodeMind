def main():
    a, b, c = map(int, input().split())
    if a + b + c >= 22:
        print("bust")
    else:
        print("win")

if __name__ == "__main__":
    main()