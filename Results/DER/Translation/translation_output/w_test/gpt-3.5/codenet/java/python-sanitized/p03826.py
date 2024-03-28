def main():
    a, b, c, d = map(int, input().split())
    result = max(a * b, c * d)
    print(result)

if __name__ == "__main__":
    main()