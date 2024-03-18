def sum_digits(n):
    # Calculate the sum of each digit of a natural number
    sum = 0
    while n != 0:
        # Use %10 to obtain the rightmost digit
        sum += n % 10
        # Eliminate the rightmost digit by using n//=10
        n //= 10
    return sum  # Return the total

# Read an integer from input
n = int(input())
a = sum_digits(n)
if n % a == 0:
    print("Yes")
else:
    print("No")