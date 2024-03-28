def main():
    # Split the input by spaces and convert each part to an integer
    a = list(map(int, input().split()))

    # Calculate the sum of the given coins' values
    b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500

    # Output 1 if the total is greater or equal to 1000, else 0
    print("1" if b >= 1000 else "0")

if __name__ == "__main__":
    main()