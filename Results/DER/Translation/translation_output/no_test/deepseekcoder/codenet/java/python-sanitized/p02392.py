def main():
    inStr = input()
    inStr = inStr.split(" ")

    a = int(inStr[0])
    b = int(inStr[1])
    c = int(inStr[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()