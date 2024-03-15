def main():
    k = 360
    j = 1

    try:
        i = int(input("Enter an integer: "))

        if 1 <= i <= 179:
            while (i * j) % k != 0:
                j += 1
            print(j)
        else:
            print("Please enter an angle to rotate between 1 ~ 179 degrees.")
    except ValueError:
        print("Please enter a valid integer.")

if __name__ == "__main__":
    main()