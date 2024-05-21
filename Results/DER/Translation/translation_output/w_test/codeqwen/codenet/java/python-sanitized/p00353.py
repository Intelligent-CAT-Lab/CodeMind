def main():
    input_str = input()
    input_list = input_str.split()
    m = int(input_list[0])
    f = int(input_list[1])
    b = int(input_list[2])

    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()