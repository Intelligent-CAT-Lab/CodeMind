def main():
    a, b, c, d = map(int, input().split())
    a = a * b
    b = c * d
    print(b if a < b else a)

if __name__ == "__main__":
    main()