def main():
    n, k = map(int, input().split())
    print((n // k + 1) * k)

if __name__ == "__main__":
    main()