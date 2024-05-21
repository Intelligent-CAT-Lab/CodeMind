def main():
    a, b, c, d = map(int, input().split())
    print(max(max(max(a * c, b * d), a * d), b * c))

if __name__ == "__main__":
    main()