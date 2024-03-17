def main():
    N = int(input())

    last_digit = N % 10

    if last_digit in [2, 4, 5, 7, 9]:
        print("hon")
    elif last_digit in [0, 1, 6, 8]:
        print("pon")
    elif last_digit == 3:
        print("bon")

if __name__ == "__main__":
    main()