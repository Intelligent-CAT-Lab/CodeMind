def main():
    result = 0
    numDog = input().split()

    for i in numDog:
        result += int(i)

    print(result)

if __name__ == "__main__":
    main()