def main():
    result = 0
    num_dog = input().split()
    for i in range(len(num_dog)):
        result += int(num_dog[i])
    print(result)

if __name__ == "__main__":
    main()