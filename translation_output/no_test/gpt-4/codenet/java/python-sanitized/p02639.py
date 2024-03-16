def main():
    x = []
    sum = 0
    for i in range(5):
        number = int(input())
        x.append(number)
        sum += number
    print(15 - sum)

if __name__ == "__main__":
    main()