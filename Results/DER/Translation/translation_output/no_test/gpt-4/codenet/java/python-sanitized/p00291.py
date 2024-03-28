def main():
    a = []

    # Get input for the list
    for i in range(6):
        value = int(input())
        a.append(value)

    # Calculate the sum with the specific weights
    b = a[0] + a[1] * 5 + a[2] * 10 + a[3] * 50 + a[4] * 100 + a[5] * 500

    # Output the result
    if b >= 1000:
        print("1")
    else:
        print("0")

if __name__ == '__main__':
    main()