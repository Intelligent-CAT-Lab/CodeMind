def main():
    input_values = input().split(" ")
    m = int(input_values[0])
    f = int(input_values[1])
    b = int(input_values[2])

    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()