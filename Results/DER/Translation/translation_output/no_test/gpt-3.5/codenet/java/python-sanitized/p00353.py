def main():
    input_str = input()
    input_list = input_str.split()
    m, f, b = map(int, input_list)

    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()