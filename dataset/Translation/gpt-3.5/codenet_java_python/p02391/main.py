def main():
    CMD = input()
    str = CMD.split()

    x = int(str[0])
    y = int(str[1])

    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    else:
        print("a > b")

if __name__ == "__main__":
    main()