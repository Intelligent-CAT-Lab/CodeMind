def main():
    s = input()
    c = sum(int(char) for char in s)
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()