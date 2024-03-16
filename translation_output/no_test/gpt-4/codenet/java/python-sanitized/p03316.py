def sum_digits(n):
    # Calculate the sum of each digit of a natural number
    sum = 0
    while n != 0:
        # Use %10 to get the rightmost digit
        sum += n % 10
        # Use n//=10 to remove the rightmost digit
        n //= 10
    return sum  # Return the total

def main():
    # Read an integer from input
    n = int(input())
    a = sum_digits(n)
    if n % a == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()