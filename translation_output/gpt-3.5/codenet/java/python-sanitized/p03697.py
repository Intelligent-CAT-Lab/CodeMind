def main():
    a, b = map(int, input().split())
    if a + b >= 10:
        print("error")
    else:
        print(a + b)

if __name__ == "__main__":
    main()