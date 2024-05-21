def main():
    a, b = map(int, input().split())
    print(b % a == 0 and a + b or b - a)

if __name__ == "__main__":
    main()