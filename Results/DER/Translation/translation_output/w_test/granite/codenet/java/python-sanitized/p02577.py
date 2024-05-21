def main():
    s = input()
    c = sum(int(digit) for digit in s)
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()