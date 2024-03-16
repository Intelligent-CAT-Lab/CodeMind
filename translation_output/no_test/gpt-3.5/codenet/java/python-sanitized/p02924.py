def main():
    n = int(input())

    result = 0
    for i in range(n-1, 0, -1):
        result += i

    print(result)

if __name__ == "__main__":
    main()